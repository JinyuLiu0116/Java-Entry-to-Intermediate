package com.mac190.oopPractice.toString;

public class ToString {
    String name;
    String job;
    String hobby;
    String favoriteFood;
    double salary;

    public ToString(String name, String job, String hobby, String favoriteFood, double salary) {
        this.name = name;
        this.job = job;
        this.hobby = hobby;
        this.favoriteFood = favoriteFood;
        this.salary = salary;
    }
    public String toString()
    {
        return name+"\n"+job+"\n"+hobby+"\n"+favoriteFood+"\n"+salary;
    }
}
