package com.mac190.stocks_abstract_exception;

import java.util.ArrayList;

/*
 * Design an abstract class Broker that has the following:
 // A list of securities.See Security class
 * abstract method buy that accepts all the required parameters
 * abstract class sell that requires as well all parameters.
 */
public abstract class Broker {
    //A list of securities
    private ArrayList<Position> holdings;

    public Broker() {
        //create the holding list
        holdings=new ArrayList<Position>();
    }
    //getter for holdings
    public ArrayList<Position> getHoldings() {
        return holdings;
    }
    //toString to display all the holdings
    @Override
    public String toString() {
        return "Broker(holdings: " + this.getHoldings() + ")";
    }

    abstract  void buy(String ticker, String type, int shares, float price) throws Exception;
    abstract double sell(String ticker, String type, int shares, float price) throws Exception;
}
