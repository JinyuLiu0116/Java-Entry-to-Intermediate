package com.mac190.practice1;
/*
 * Write a program that accepts a grade in a form of a string from the user
 * possibilities are: F, D, C, B-, B, B+, A-, A, A+
 * and displays the grade in percentage:
 * F : less than 60, D: 60-65, C:65-70, B-: 70-75,, B:75-80, B+: 80-85, A-: 85-90
 * A: 90-95, A+:95-100.
 * use a switch statement.
 */

import java.util.Scanner;

public class Swicth {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter your grade:");
        String grade = keyb.nextLine();
        switch (grade) {
            case "A+":
                System.out.println("95-100");
                break;
            case "A":
                System.out.println("90-95");
                break;
            case "A-":
                System.out.println("85-90");
                break;
            case "B+":
                System.out.println("80-85");
                break;
            case "B":
                System.out.println("75-80");
                break;
            case "B-":
                System.out.println("70-75");
                break;
            case "C":
                System.out.println("65-70");
                break;
            case "D":
                System.out.println("60-65");
                break;
            case "F":
                System.out.println("You fail.");
                break;
            default:
                System.out.println("Invalid input");
        }


    }
}
