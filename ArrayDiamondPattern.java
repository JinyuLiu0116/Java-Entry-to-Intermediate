package com.mac190.array;
import java.util.Scanner;
public class ArrayDiamondPattern {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyb.nextInt();

        if(num % 2 ==0){
            num --;
        }
        for(int i=1; i<=num; i+=2)
        {
            for(int n=num-i;n>0;n-=2)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=3; i<=num; i+=2)
        {
            for(int n=1;n<=i-2;n+=2)
                System.out.print(" ");
            for(int j=i; j<=num; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
