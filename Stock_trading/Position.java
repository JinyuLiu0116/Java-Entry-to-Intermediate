package com.mac190.stocks_abstract_exception;

public class Position {
    private String Ticker; //"AAPL"
    private String Type; //"STK" or "CUR"
    private int Shares;
    private float Price;

    public Position(String ticker, String type, int shares, float price){
        this.Ticker = ticker;
        this.Type = type;
        this.Shares = shares;
        this.Price = price;
    }

    public String getTicker() {
        return this.Ticker;
    }

    public String getType() {
        return this.Type;
    }

    public int getShares() {
        return this.Shares;
    }

    public float getPrice() {
        return this.Price;
    }

    public void setTicker(String ticker) {
        this.Ticker = ticker;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public void setShares(int shares) {
        this.Shares = shares;
    }

    public void setPrice(float price) {
        this.Price = price;
    }
    public String toString(){
        return "ticker: " + this.Ticker + " type: " + this.Type + " num shares: " + this.Shares + " price: " + this.Price;
    }
}
