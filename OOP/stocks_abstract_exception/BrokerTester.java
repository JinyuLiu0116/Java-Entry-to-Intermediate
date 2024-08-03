package com.mac190.stocks_abstract_exception;

import com.mac190.stocks_abstract_exception.Ameritrade;
import com.mac190.stocks_abstract_exception.Broker;
import com.mac190.stocks_abstract_exception.Oanda;

import java.util.Locale;
import java.util.Scanner;

public class BrokerTester {
    public static void main(String[] args)  {
        Broker stockbroker = new Ameritrade();
        Broker currencybroker = new Oanda();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("What would you like to buy?");
            System.out.println("Currency or Stock?");
            choice = sc.next().toLowerCase(Locale.ROOT);
            if (choice.contains("stock")) {
                System.out.println("What's the ticker of your stock: ");
                String ticker = sc.next();
                System.out.println("How many shares would you like: ");
                int shares = sc.nextInt();
                System.out.println("How much are you paying: ");
                float price  = sc.nextFloat();
                try {
                    stockbroker.buy(ticker, "STK", shares, price);

                }catch(myException e){
                    System.out.println("caught exception: " + e.getMessage());
                    e.sayHi();
                }catch(Exception e){
                    System.out.println("Caught exception: " + e.getMessage());
                }
            }
            if (choice.contains("currency")) {
                System.out.println("What currency would you like to buy: ");
                String ticker = sc.next();
                System.out.println("How many shares would you like: ");
                int shares = sc.nextInt();
                System.out.println("How much are you paying: ");
                float price  = sc.nextFloat();
                try {
                    currencybroker.buy(ticker, "CUR", shares, price);
                }catch(Exception e){
                    System.out.println("Caught exception: " + e.getMessage());
                }
            }
            System.out.println("Stock Holdings: " + stockbroker.getHoldings().toString() + "\nCurrency Holdings: "+ currencybroker.getHoldings().toString());
        } while (!choice.contains("quit"));
    }
}
