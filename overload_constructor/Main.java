package com.mac190.oopPractice.overload_constructor;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        pizza1.display();
        Pizza pizza2 = new Pizza("Thick crust", "Tomato", "Mozzarell");
        pizza2.display();
        Pizza pizza3 = new Pizza("Thick crust", "Tomato");
        pizza3.display();
        Pizza pizza4 = new Pizza("Thiick crust");
        pizza4.display();


    }
}