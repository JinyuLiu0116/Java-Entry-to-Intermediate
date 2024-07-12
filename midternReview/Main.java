package com.mac190.midternReview;

public class Main {
    public static void main(String[] args) {


        Circle test1 = new Circle();
        System.out.println(test1.toString());

        Point p1= new Point(4);
        Circle test2 = new Circle(p1, 4);
        System.out.println(test1.toString());

        Circle test3 = new Circle();
        Circle test4 = new Circle();
        Circle test5 = new Circle();
    }
}
