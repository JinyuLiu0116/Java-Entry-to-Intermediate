package com.mac190.oopPractice.point_circle;

public class PointTester {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("p1:" + p1);

        Point p2 = new Point(5.0);
        System.out.println("p2:" + p2);

        Point p3 = new Point(3.0, 6.0);
        System.out.println("p3:" + p3);

        if (p3.equals(p2)) {
            System.out.println("they are equals");
        } else {
            System.out.println("they are not equals");
        }

        Point p4 = new Point(10, 11);
        System.out.println("p4:" + p4);
        p4 = p4.add(3.0);
        System.out.println("p4:" + p4);

        System.out.println("p3:" + p3);
        p3 = p3.add(6, 10);
        System.out.println("p3:" + p3);

        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        p1 = p1.add(p2);
        System.out.println("p1:" + p1);



    }
}
