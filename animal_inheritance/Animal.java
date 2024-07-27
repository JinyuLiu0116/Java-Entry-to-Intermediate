package com.mac190.animal_inheritance;

public class Animal {
    private String color, species, diet,status;
    private int age;

    public Animal(){
        this.age=0;
        this.color="unknown";
        this.species="unknown";
        this.diet="unknown";
        this.status="unknown";
    }
    public Animal(int age, String color, String species, String diet, String status){
        this.age=age;
        this.color=color;
        this.species=species;
        this.diet=diet;
        this.status=status;
    }
    public Animal(Animal a){
        this.age=a.getAge();
        this.color=a.getColor();
        this.species=a.getSpecies();
        this.diet=a.getDiet();
        this.status=a.getStatus();
    }
    public void setAge(int a){
        if(a>=0) {
            this.age = a;
        }else{
            System.out.println("Age can't not be negative.");
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setColor(String a){
        this.color=a;
    }
    public String getColor(){
        return this.color;
    }
    public void setSpecies(String a){
        this.species=a;
    }
    public String getSpecies(){
        return this.species;
    }
    public void setStatus(String a){
        this.species=a;
    }
    public String getStatus(){
        return this.status;
    }
    public void setDiet(String a){
        this.diet=a;
    }
    public String getDiet() {
        return this.diet;
    }
    public String toString(){
        return "Animal: {"+this.getSpecies()+", "+this.getAge()+", "
                +this.getColor()+", "+this.getDiet()+", "+this.getStatus()+"}";
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Animal)) return false;
        Animal a=(Animal) obj;
        return this.getAge()==a.getAge()&&this.getDiet().equals(a.getDiet())&&this.getColor().equals(a.getColor())
                &&this.getSpecies().equals(a.getSpecies())&&this.getStatus().equals(a.getStatus());
    }
    public void speak(){
        System.out.println("Animal's voice......!!!!");
    }


}
