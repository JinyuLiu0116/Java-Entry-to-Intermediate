package com.mac190.even;

public class Eventester {
    public static void main(String[] args) {
        Even test = new Even();
        System.out.println(test.toString());

        test.add(5);
        System.out.println(test.toString());
    }
}
