package com.mac190.oopPractice.objectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage1 = new Garage();
        Car car1 = new Car("BMW");

        System.out.println("Welcome, you can park your car.");
        garage1.parking(car1);

        System.out.println("Thank you for parking, see you next time.");
        garage1.unpark(car1);


    }
}
