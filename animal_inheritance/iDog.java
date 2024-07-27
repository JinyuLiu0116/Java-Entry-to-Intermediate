package com.mac190.animal_inheritance;

public class iDog extends Animal{
    private String name;

    public iDog(){
        super(0, "unknown", "Dog", "omnivore", "unknown");
        this.name="unknown";
    }
    public iDog(int Age,String Color,String Status, String name){
        super(Age, "Color", "Dog", "omnivore", Status);
        this.name=name;
    }
    public void setName(String a){
        this.name=a;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return super.toString()+", (Name: "+getName()+")";
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof iDog)) return false;
        iDog d=(iDog) obj;
        return super.equals(d)&&this.getName().equals(d.getName());
    }
    public void speak(){
        System.out.println("Wolf Wolf......");
    }
}
