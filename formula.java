package com.mac190.formula;
import java.util.Scanner;
public class formula {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);

        int N;
        double e,f1,f2,f3,f4,formula;

        System.out.print("Enter a integer number:");
        N = keyb.nextInt();
        System.out.print("Enter a dismal number:");
        e = keyb.nextDouble();

        f1 = Math.pow(N,4)-3;
        f2 = 1-Math.sin(e);
        f3 = Math.pow(f2,2);
        f4 = f1/f3;
        formula = Math.pow(f4,(1/5.0));
        System.out.println("After following a complicated formula, the result is: "+formula);


    }
}
