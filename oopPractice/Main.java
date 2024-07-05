package com.mac190.oopPractice;

public class Main {
    public static void main(String[] args){
        Car myCar = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.price);

        myCar.drive();
        myCar.brake();
        Car newCar = new Car();
        newCar.price =35000.00;
        System.out.println(newCar.price);
        newCar.color = "red";
        System.out.println(newCar.color);
        newCar.year=2024;
        System.out.println(newCar.year);

        newCar.drive();
        newCar.brake();

        System.out.println("You have a "+newCar.make+" "+newCar.model+" "+newCar.year);


    }
}
