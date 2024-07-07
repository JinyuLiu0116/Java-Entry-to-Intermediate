package com.mac190.oopPractice.arrayOfObject;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        char[] characters = new char[10];
        String[] strings = new String[3];

        for (int index = 0; index < 10; index++) {
            numbers[index] = rand.nextInt(10) + 1;
            System.out.print(numbers[index] + " ");
        }
        System.out.println();

        for (int index = 0; index < 10; index++) {
            int conver = rand.nextInt(26) + 66;
            characters[index] = (char) conver;
            System.out.print(characters[index]);
        }
        System.out.println();

        Food food1=new Food("Pizza");
        Food food2=new Food("Hamburger");
        Food food3=new Food("Hot dog");
        Food[] food = {food1,food2,food3};
        for(int index=0;index<3;index++)
        {
            System.out.println(food[index].name);
        }


    }
}
