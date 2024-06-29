package com.mac190.homework2;
import java.util.Scanner;
public class ArrayFindPrimeNumber {
    public static final int SIZE = 20;// globe constant SIZE
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int[] array = new int[SIZE];

        for(int i=0; i<SIZE; i++)
        {
            System.out.print("Enter number for array["+i+"]: ");
            array[i]=keyb.nextInt();
        }
        System.out.print("There has "+numPrimes(array)+" prime numbers.");
    }
    public static boolean isPrime(int num)
    {
        if(num < 0)//negative number are invalid.
            return false;
        else if(num == 2)
            return true;
        for(int i=2;i<num;i++)//i start from 2
        {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int numPrimes(int[] array)
    {
        int counter=0;
        for(int i=0; i<SIZE; i++)
        {
            if(isPrime(array[i]))
            {
                counter++;
            }
        }
        return counter;
    }

}
