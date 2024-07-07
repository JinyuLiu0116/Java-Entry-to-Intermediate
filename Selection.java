package com.mac190.practice1;
/*
 * aX^2 + bX + c = 0 is second order equation a != 0
 *
 * if a is 0, then it is a first order equatio and there is one solution = -c/b
 * if a is not 0 then
 * 		compute the discriminant D = b^2 - 4ac
 * 		if D is 0 then there is one double solution which is -b/2a
 * 		else if D is larger than 0 then there are two distinct solutions:
 * 				X1 is -b + sqrt(D)/2a
 * 				X2 is -b - sqrt(D)/2a
 * 		else (D is negative) then there are no real solutions.
 *
 * Write a program that accepts the coefficients of a second order equation
 * (a, b, and c) and displays the solutions to the equation.
 *
 *
 Modify the program to keep runnung for as long as the user answers yes to a question
 Do you want run the program again? [yes/no]
 */
import java.util.Scanner;
public class Selection {
    public static void main(String[] args){
        Scanner keyb=new Scanner(System.in);
        double a,b,c;
        char choice='y';
        while(Character.toLowerCase(choice)!='n') {
            System.out.println("Enter the coefficients:");
            a=keyb.nextDouble();
            b=keyb.nextDouble();
            c=keyb.nextDouble();
            if (a == 0)
                System.out.println("This is a first order equation, it has one solution:" + -c / b);
            else if (a != 0) {
                double D = b * b - 4 * a * c;
                if (D == 0)
                    System.out.println("This is one double solution:" + -b / (2 * a));
                else if (D > 0) {
                    double X1 = (-b + Math.sqrt(D)) / (2 * a);
                    double X2 = (-b - Math.sqrt(D)) / (2 * a);
                    System.out.println("The equation has two solutions: X1=" + X1 + ", X2=" + X2);
                } else
                    System.out.println("There are no real solution.");
            }
            System.out.print("Do you want to continue?(y/n):");
            keyb.nextLine();//flash the keyboard
            choice=keyb.next().charAt(0);
        }
        System.out.print("Thank you for use.");
    }
}
