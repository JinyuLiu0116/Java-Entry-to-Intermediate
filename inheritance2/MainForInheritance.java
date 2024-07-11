package com.mac190.oopPractice.inheritance2;

public class MainForInheritance {
    public static void main(String[] args) {

        Car car = new Car();
        car.go();
        car.stop();

        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.stop();

        Vehicle vehicle = new Vehicle();
        vehicle.go();
        vehicle.stop();
    }
}
