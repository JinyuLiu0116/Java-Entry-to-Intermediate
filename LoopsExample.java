package com.mac190.loopsExample;
import java.util.Scanner;
public class LoopsExample {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyb.nextInt();

        if(num % 2 ==0){
            num = num -1;
        }
        for(int i=1; i<=num; i+=2)
        {
            for(int n=num-i;n>0;n-=2)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int spaceCouter=1;
        for(int i=3; i<=num; i+=2)
        {
            for(int n=0;n<spaceCouter;n++)
            {
                System.out.print(" ");

            }
            spaceCouter++;
            for(int j=i; j<=num; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
