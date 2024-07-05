package com.mac190.oopPractice.human;

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void study(){
        System.out.println(this.name+" is study.");
    }
    void rest(){
        System.out.println(this.name+" is resting.");
    }
}
