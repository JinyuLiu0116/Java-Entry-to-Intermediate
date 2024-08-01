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
        //if not STK display error and return

        //if less than 10 shares, display error and return

        //check if the security already exists,

        //if it's the case add to it
        //I have already a position of this ticker, add to it

        //if no position already, make a new Security
        //add it to the list

    }

    @Override
    public double sell(String ticker, String type, int shares, float price) throws Exception{
        //if not STK display throw exception

        //check if we have the stock

        //If we have it update position
        //if selling more than or equal to what we have
        //sell everything and remove the position
        //otherwise sell what requested and return the profit

    }
}
}
