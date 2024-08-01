package com.mac190.stocks_abstract_exception;

import java.util.ArrayList;

public interface iBroker {
    ArrayList<Position> getHoldings() ;
    public void buy(String ticker, String type, int shares, float price) throws Exception;
    double sell(String ticker, String type, int shares, float price) throws Exception;
}
