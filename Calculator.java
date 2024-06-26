package com.mac190.calcularter;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] rags){
        Scanner keyb = new Scanner(System.in);
        double num1, num2;
        char operater;
        System.out.println("Enter an expression in the form of a + b : ");
        num1 = keyb.nextDouble();
        operater = keyb.next().charAt(0);
        num2 = keyb.nextDouble();
        if(operater=='+')
        {
            double result = num1 + num2;
            System.out.println(num1+" + "+num2+"="+result);
        }
        else if(operater == '-')
        {
            double result = num1 - num2;
            System.out.println(num1+" - "+num2+"="+result);
        }
        else if(operater == '*')
        {
            double result = num1 * num2;
            System.out.println(num1+" * "+num2+"="+result);
        }
        else if(operater == '/')
        {
            double result = num1 / num2;
            System.out.println(num1+" / "+num2+"="+result);
        }
        else
        {
            System.out.println("Invalid input.");
        }
    }
}
