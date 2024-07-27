package com.mac190.rectangle_cube;

public class Rectangle_Cube_tester {
    public static void main(String[] args){

        iCube c1=new iCube();

        System.out.println("c1:"+c1);

        Rectangle r1=new Rectangle(6,7);

        System.out.println("r1: "+r1+", area: "+r1.area()+", multiply by 12: "+r1.multiply(12));

        iCube c2=new iCube(r1,11);

        System.out.println("c2:"+c2);

        iCube c3=new iCube(3,-4,9);

        System.out.println("c3:"+c3);

        iCube c5=new iCube(c2);

        System.out.println("c5:"+c5);

        System.out.println("c3,base:"+c3.getBase());

        System.out.println("c2, length:"+c2.getLength());

        System.out.println("c1, width:"+c1.getWidth());

        c3.setHeight(12);

        System.out.println("c3, height:"+c3.getHeight());

        System.out.println("c3:"+c3);

        c1.setBase(-3);

        System.out.println("c1,base:"+c1.getBase());

        c2.setLength(15);

        System.out.println("c2, length:"+c2.getLength());

        c3.setWidth(-20);

        System.out.println("c3, width:"+c3.getWidth());

        if(c3.equals(c2))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");
        r1.setLength(15);
        if(r1.equals(c2))
            System.out.println("c2 equals to r1");
        else
            System.out.println("They are not equal");

        System.out.println("volume of c3:"+c3.Volume());

        System.out.println("c1:"+c1);

        System.out.println("c2:"+c2);

        iCube c4=new iCube(c1.add(c2));

        System.out.println("c4:"+c4);

        c5=c5.multiply(-3.5);

        System.out.println("c5"+c5);

    }

}
