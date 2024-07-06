package com.mac190.oopPractice.overload_constructor;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }


    void display() {
        System.out.println("You have ordered a pizza with:" + this.bread + ", " + this.sauce +
                ", " + this.cheese + ", " + this.topping);
    }


}
