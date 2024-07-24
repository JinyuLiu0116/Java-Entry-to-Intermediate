package com.mac190.binding;

public class Animal {
    private String color, species, diet;
    private int age;

    public Animal(){
        age = 0;
        color = species = diet = "unknown";
    }
    public Animal(int a, String s, String d, String c){
        age = a;
        species = s;
        diet = d;
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return (age == animal.age && color.equals(animal.color) && species.equals(animal.species) && diet.equals(animal.diet));
    }

    public void speak(){
        System.out.println("I don't know how to speak, yet!");
    }
}
