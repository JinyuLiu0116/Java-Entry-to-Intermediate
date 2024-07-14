package com.mac190.oopPractice.point_circle;

public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1:" + c1);
        System.out.println();

        Point p1 = new Point(6);
        System.out.println("p1:" + p1);
        Circle c2 = new Circle(p1, 5);
        System.out.println("c2:" + c2);
        System.out.println();

        Circle c3 = new Circle(5, 6, 7);
        System.out.println("c3" + c3);
        System.out.println("center of c3:" + c3.getCenter());
        System.out.println();

        c3.setX(c3.getX() + 1);
        c3.setRadius(c3.getRadius() - 2);
        if (c2.equals(c3)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);
        System.out.println();

        c1 = c1.add(8);
        System.out.println("c1:" + c1);
        Point p2 = new Point(10, 15);
        System.out.println("p2:" + p2);
        Circle c4 = c1.add(p2);
        System.out.println("c4" + c4);
        System.out.println();

        Circle c5 = c2.add(c3);
        System.out.println("c5" + c5);
        System.out.println("area of c5 is:" + c5.area());


    }
}
