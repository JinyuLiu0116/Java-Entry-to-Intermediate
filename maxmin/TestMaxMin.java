package com.mac190.maxmin;

public class TestMaxMin {
    public static void main(String[] args) {
        //constructors
        MaxMin test = new MaxMin(5, 4);
        System.out.println(test.toString());
        MaxMin test1 = new MaxMin();
        System.out.println(test1.toString());
        MaxMin test2 = new MaxMin(5);
        System.out.println(test2.toString());
        //getMax()
        System.out.println("The max number is:"+test.getMax());
        //getMin()
        System.out.println("The min number is:"+test.getMin());
        //setMax()
        System.out.println(test.toString());
        test.setMax(3);
        System.out.println(test.toString());
        //setMin()


    }
}
