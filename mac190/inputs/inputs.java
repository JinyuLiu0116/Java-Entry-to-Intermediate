package com.mac190.inputs;
import java.util.Scanner;
//to read inputs from the user, we use Scanner object.
//for instance let's write a program that prompts the user
//to enter three integers and we compute their average and we display it

//first we prompt the user about what we expect him to do

public class inputs {
    public static void main(String[] args){
        System.out.println("Enter three integers: ");
        Scanner keyb = new Scanner(System.in);
        int num1 = keyb.nextInt();
        int num2 = keyb.nextInt();
        int num3 = keyb.nextInt();
        double average = (num1 + num2 + num3)/3.0;

    }
}
