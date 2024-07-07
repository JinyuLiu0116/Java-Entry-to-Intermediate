package com.mac190.practice1;
//write a program that accepts three integers from the user
//and computes their average and displays it.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1 = keyb.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = keyb.nextDouble();
        System.out.print("Enter the third number:");
        double num3 = keyb.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.print("The average number is:" + average);


    }
}
