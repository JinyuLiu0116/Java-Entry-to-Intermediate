package com.mac190.iCircle;

import com.mac190.midternReview.Point;

public class ICircleTester {
    public static void main(String[] args){
        ICircle c1=new ICircle();
        System.out.println("c1:"+c1);
        Point p1=new Point(7,9);
        System.out.println("p1:"+p1+", distance:"+p1.Distance(c1));
        c1.setX(7);
        c1.setY(9);
        c1.setRadius(10);
        System.out.println("c1:"+c1);

        if(p1.equals(c1))
            System.out.println("p1 equals to c1.");
        else
            System.out.println("p1 not equals to c1.");

        ICircle c2=new ICircle(12, 24, 16);
        System.out.println("c2:"+c2+", area:"+c2.area());
    }
}