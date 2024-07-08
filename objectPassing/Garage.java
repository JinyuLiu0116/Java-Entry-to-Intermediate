package com.mac190.oopPractice.objectPassing;

public class Garage {

    void parking(Car car){
        System.out.println("The "+car.name+" is parked in the garage.");
    }
    void unpark(Car car){
        System.out.println("The "+car.name+" is not in the garage.");
    }
}
