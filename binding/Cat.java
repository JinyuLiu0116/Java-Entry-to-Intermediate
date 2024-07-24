package com.mac190.binding;

public class Cat extends Animal {
  private String breed, name;


    public Cat(){
        super(0, "Cat", "omnivor", "unknown");

        breed = "unknown";
        name = "unknown";
    }
    //constructor of Dog accepting all attributes
    public Cat(String b, String n, int a, String c){
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

        Cat cat = (Cat) o;
        return super.equals(cat)&&this.getBreed().equals(cat.getBreed())&&this.getName().equals(cat.getName());
    }

}
