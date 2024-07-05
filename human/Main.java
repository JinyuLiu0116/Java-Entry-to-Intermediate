package com.mac190.oopPractice.human;

public class Main {
    public static void main(String[] args){

        Human human1 = new Human("jojo",20,160.00);
        Human human2 =new Human("yoyo",18,120);

        System.out.println("Student 1:"+human1.name+", "+human1.age+" years old, weight:"+human1.weight+" pound.");
        human1.study();
        human1.rest();
        System.out.println("Student 2:"+human2.name+", "+human2.age+" years old, weight:"+human2.weight+" pound.");
        human2.study();
        human2.rest();


    }
}
