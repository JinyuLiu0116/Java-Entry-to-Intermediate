package com.mac190.binding;

public class Dog extends Animal {
    private String breed, name;


    public Dog(){
        super(0, "Canine", "omnivor", "unknown");

        breed = "unknown";
        name = "unknown";
    }
    //constructor of Dog accepting all attributes
    public Dog(String b, String n, int a, String c){
        super(a, "Canine", "Omnivor", c);
        breed = b;
        name = n;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
    public void speak(){
        System.out.println("Waf waf!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;
        return super.equals(dog)&&this.getBreed().equals(dog.getBreed())&&this.getName().equals(dog.getName());
    }
}
