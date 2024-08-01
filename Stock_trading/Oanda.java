package com.mac190.stocks_abstract_exception;

public class Oanda extends Broker implements iBroker {
    public void buy(String ticker, String type, int shares, float price) throws Exception {
        if(!type.equals("CUR")){
            throw new Exception("Only can buy CUR type stock.");
        }

        for(Position p: super.getHoldings()){
            if(p.getTicker().equals(ticker)){
                p.setPrice(((p.getShares()*p.getPrice()+shares*price)+(float)2.5)/(p.getShares()+shares));
                p.setShares(p.getShares()+shares);
            }else{
                Position p1=new Position(ticker,type,shares,price);
                super.getHoldings().add(p1);
            }
        }
    }
    @Override
    public double sell(String ticker, String type, int shares, float price) throws Exception {
        for(Position p: super.getHoldings()){
            if(!p.getTicker().equals(ticker)){
                throw new Exception("Your don't hold any position of ticker: "+ticker);
            }else{
                if(p.getShares()<shares){
                    super.getHoldings().remove(p);
                    return p.getShares()*price;
                }else{
                    p.setPrice((p.getShares()*p.getPrice()-shares*price)/(p.getShares()-shares));
                    p.setShares(p.getShares()-shares);
                }
            }
        }
        return shares*price;
    }
}
