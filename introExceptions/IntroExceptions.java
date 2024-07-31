package com.mac190.introExceptions;
import java.util.Scanner;

public class IntroExceptions {
    public static void exampleException(int a) throws Exception{
        if(a<0){
            throw new Exception(a+ " is negative.");
        }else if(a == 5){
            throw new myException(34, "This is my exception.");
        }
    }
    public static void main(String[] args){
        int[] A=new int[5];
        Scanner key=new Scanner(System.in);
        System.out.println("Enter an integer to set the index position of array A:");
        int i=key.nextInt();
        try{
            exampleException(i);
            A[i]=-34;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught an out of bounds exception: "+e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Illegal argument exception: "+e.getMessage());
        }catch(myException e){
            System.out.println("Caught my exception: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Caught exception: "+e.getMessage());
        }finally {
            System.out.println("This will always be displayed");
        }
    }
}
