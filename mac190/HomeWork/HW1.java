package com.mac190.HomeWork;
import java.util.Scanner;
public class HW1 {
    public static void main(String[] args){
        Scanner keyb=new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit=keyb.nextDouble();
        System.out.println("The temperature in Fahrenheit is: "+fahrenheit+" degree.");
        double celsius=((fahrenheit-32)*5)/9;
        System.out.println("The temperature in Celsius is: "+celsius+" degree.");
    }
}
