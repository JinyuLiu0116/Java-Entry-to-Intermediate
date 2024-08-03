package com.mac190.stocks_abstract_exception;
/*
 * Design a class Ameritrade to be a Broker. Implement the methods buy and sell so that
 * only stocks can be bought and add $1 fees for the entire purchase
 * If not stock should display an error message.
 *
 */
public class Ameritrade extends Broker implements iBroker{
    @Override
    public void buy(String ticker, String type, int shares, float price) throws Exception, Exception{
        if(!type.equals("STK")) {
            throw new Exception("Only can buy STK stock!");
        }else if(shares<10) {
            throw new Exception("Shares less than 10!");
        }else {
            for (Position p : getHoldings()) {
                if (p.getTicker().equals(ticker)) {
                    p.setPrice(((p.getShares() * p.getPrice() + shares * price) + (float) 1) / (p.getShares() + shares));
                    p.setShares(p.getShares() + shares);
                } else {
                    getHoldings().add(new Position(ticker, type, shares, price));
                }
            }
        }
    }

    @Override
    public double sell(String ticker, String type, int shares, float price) throws Exception{
        if(!type.equals("STK")) {
            throw new Exception("Only can buy STK stock!");
        }else {
            for (Position p : getHoldings()) {
                if (!p.getTicker().equals(ticker)) {
                    throw new Exception("Your don't hold any position of ticker: " + ticker);
                } else {
                    if (p.getShares() < shares) {
                        getHoldings().remove(p);
                        return p.getShares() * price;
                    } else {
                        p.setPrice((p.getShares() * p.getPrice() - shares * price) / (p.getShares() - shares));
                        p.setShares(p.getShares() - shares);

                    }
                }
            }
        }
        return shares*price;
    }//if not STK display throw exception

        //check if we have the stock

        //If we have it update position
        //if selling more than or equal to what we have
        //sell everything and remove the position
        //otherwise sell what requested and return the profit
}
