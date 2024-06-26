package com.mac190.formula;
import java.util.Scanner;
public class formula {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);

        int N;
        double e;

        System.out.print("Enter a integer number:");
        N = keyb.nextInt();
        System.out.print("Enter a dismal number:");
        e = keyb.nextDouble();

        double f1 = Math.pow(N,4)-3;
        double f2 = 1-Math.sin(e);
        double f3 = Math.pow(f2,2);
        double f4 = f1/f3;
        double formula = Math.pow(f4,(1/5.0));
        System.out.println("After following a complicated formula, the result is: "+formula);


    }
}
