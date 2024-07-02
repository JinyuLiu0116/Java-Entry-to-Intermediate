package com.mac190.introclasses;

public class ExamplTester {
    public static void main(String[] args) {
        //create an object IntroClass
        Introclasses myObj = new Introclasses();
        //to access the member variables
        myObj.num =2;
        myObj.num2 = 5;
        //How do you print the attributes of myObj
        myObj.print();
        myObj.addOne();
        myObj.addOne();
        //create another object
        Introclasses secondObj = new Introclasses();
        secondObj.num = 4;
        secondObj.num2 = 5;
        secondObj.print();
    }
}
