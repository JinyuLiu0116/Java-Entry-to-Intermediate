package com.mac190.maxminprime;

import com.mac190.prime.Prime;

public class Main {
    public static void main(String[] args) {
        MaxMinPrime test1 = new MaxMinPrime();
        System.out.println(test1.toString());

        MaxMinPrime test2 = new MaxMinPrime(4);
        System.out.println(test2.toString());

        Prime p = new Prime(10);
        MaxMinPrime test3 = new MaxMinPrime(p);
        System.out.println(test3.toString());

        MaxMinPrime test4 = new MaxMinPrime(9, 8);
        System.out.println(test4.toString());

        Prime a = new Prime(9);
        Prime b = new Prime(22);
        MaxMinPrime test5 = new MaxMinPrime(a, b);
        System.out.println(test5.toString());

        System.out.println(test1.getMax());
        System.out.println(test2.getMin());
        System.out.println(test3.getIntMax());
        System.out.println(test4.getIntMin());

        test1.setMax(p);
        System.out.println(test1.toString());
        test1.setMin(b);
        System.out.println(test1.toString());

        test2.setIntMax(30);
        System.out.println(test2.toString());
        test2.setIntMin(8);
        System.out.println(test2.toString());

        if (test3.equals(test5)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        MaxMinPrime test6 = test4.add(50);
        System.out.println(test6.toString());

        MaxMinPrime test7 = test4.add(b);
        System.out.println(test7.toString());

        MaxMinPrime test8 = test4.add(test5);
        System.out.println(test8.toString());


    }
}
