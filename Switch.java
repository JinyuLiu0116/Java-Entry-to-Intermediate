package com.mac190.switchStatement;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        double num1, num2;
        char op;
        System.out.println("Enter an expression in the form of a + b : ");
        num1 = keyb.nextDouble();
        op = keyb.next().charAt(0);
        num2 = keyb.nextDouble();
        //use switch, we cannot use double for condition
        switch(op)
        {
            case '+':
            {
                double result = num1 + num2;
                System.out.println(num1+" + "+num2+"="+result);
            } break;
            case '-':
            {
                double result = num1 - num2;
                System.out.println(num1+" - "+num2+"="+result);
            } break;
            case '*':
            {
                double result = num1 * num2;
                System.out.println(num1+" * "+num2+"="+result);
            } break;
            case '/':
            {
                if(num2 == 0)
                {
                    System.out.println("Division by zero.");
                }
                else {
                    double result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + "=" + result);
                }
            } break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
