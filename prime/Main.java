package com.mac190.prime;

public class Main {
    public static void main(String[] args) {
        //creat an object using a default constructor
        Prime p = new Prime();
        System.out.println("P:" + p);
        Prime p1 = new Prime(24);
        System.out.println("P1:" + p1);
        p.add(24);
        System.out.println("p:" + p);
        p = p.add(24);
        System.out.println("p:" + p);

        if (p.equals(p1)) {
            System.out.println("p is equal to p1");
        } else {
            System.out.println("p is not equal to p1");
        }
        //add 6 to p1 using the static method
        p1 = Prime.add(p1, 6);
        System.out.println("p1:" + p1);
        //create a third prime object p2 as the sum of p and p1
        Prime p2 = p.add(p1);
        System.out.println("p2:" + p2);
    }
}
