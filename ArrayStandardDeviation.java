package com.mac190.array;
import java.util.Scanner;
public class ArrayStandardDeviation {
    public static void main(String[] args) {
        final int SIZE = 5;
        Scanner keyb = new Scanner(System.in);
        double[] array = new double[SIZE];
        int sumOfArray = 0;
        for(int i=0;i<SIZE;i++)
        {
            System.out.print("Enter number for array["+i+"]:");
            array[i]=keyb.nextDouble();
            sumOfArray+=array[i];
        }
        double average = sumOfArray/SIZE;
        double sumOfNemer=0;

        for(int i=0; i<SIZE; i++)
        {
            //(array[i]-average)^2
            sumOfNemer+=Math.pow(array[i]-average,2);//Numerator
        }
        double standDeviation=Math.sqrt(sumOfNemer/SIZE);
        System.out.println("The result is: "+standDeviation);
        //squrt((sum of (array[i]-average)^2)/20)
    }
}
