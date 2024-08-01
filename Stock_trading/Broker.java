package com.mac190.stocks_abstract_exception;

import java.util.ArrayList;

public abstract class Broker {

    private ArrayList<Position> holdings;

    public Broker() {

        holdings=new ArrayList<Position>();
    }

    public ArrayList<Position> getHoldings() {
        return holdings;
    }

    @Override
    public String toString() {
        return "Broker(holdings: " + this.getHoldings() + ")";
    }

    abstract  void buy(String ticker, String type, int shares, float price) throws Exception;
    abstract double sell(String ticker, String type, int shares, float price) throws Exception;
}
