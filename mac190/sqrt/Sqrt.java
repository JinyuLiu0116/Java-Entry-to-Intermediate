package com.mac190.sqrt;
import java.util.Scanner;
//Write a program that accepts a double value val and computes val^2
// the square root of val the cubic root of val and displays all of them.
//To compute a power we use Math.pow(double x, double y) returns x^y
//To compute a square root we use sqrt(double a)
//The cubic root of 14 is Math.pow(14, 0.333)
public class Sqrt {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner keyb = new Scanner(System.in);
        double val = keyb.nextDouble();
        double square=Math.pow(val, 2);
        double squareRoot = Math.sqrt(val);
        double cubicRoot = Math.pow(val, 1.0/3.0);
        System.out.println("The number raise to the power two is:"+square);
        System.out.println("the square root of the number is:"+squareRoot);
        System.out.println("the cubic root of the number is:"+cubicRoot);
    }
}
