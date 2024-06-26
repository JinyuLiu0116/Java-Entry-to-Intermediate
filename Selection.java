package com.mac190.selection;
//The condition needs to evaluate to true or false.
//Write a program that converts from celcious to fahrenheit and
//from fahrenheit to celcius depending on user's choice
//first ask the user which conversion wishes to make
//then ask for the temperature and make the appropriate conversion
import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int choice;
        double tempert;
       // boolean choice;
        System.out.print("Enter 1: converse celcious to fahrenheit. Enter 2: converse fahrenheit to celcious.");
        choice = keyb.nextInt();
        System.out.println("Enter the temperature: ");
        tempert = keyb.nextDouble();
        if(choice == 1)
        {
            double result = ((tempert*9)/5)+32;
            System.out.println("The temperature is: "+result+" fahrenheit degree.");
        }
        else if(choice == 2){
            double result = ((tempert-32)*5)/9;
            System.out.println("The temperature is: "+result+" celcious degree.");
        }
        else
        {
            System.out.println("Invalid input number.");
        }


    }
}
