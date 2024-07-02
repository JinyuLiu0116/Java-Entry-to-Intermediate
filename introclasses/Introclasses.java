package com.mac190.introclasses;
//a class is a blueprint that describes objects in terms of data and behavior (methods)
//objects contain data and code that acts on the data
//an object i something that has a make, number of doors, color, power, etc...
//  public class className{
//  member variables
//  methods
//

public class Introclasses {
        //member variable integer
        int num;
        int num2;
        //methods
        public void print(){
            System.out.println("num: "+num+" num2: "+num2);
        }
        //methods
        public void addOne(){
            num++;
        }
        //method to return the max of the two
        public int max(){
            if(num > num2)
                return num;
            return num2;
        }
    }
