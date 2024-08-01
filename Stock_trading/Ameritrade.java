package com.mac190.stocks_abstract_exception;

public class Ameritrade extends Broker implements iBroker{
    @Override
    public void buy(String ticker, String type, int shares, float price) throws Exception, Exception{
       
    }

    @Override
    public double sell(String ticker, String type, int shares, float price) throws Exception{
        
    }
}
}
