package com.mac190.animal_inheritance;

public class iCat extends Animal{
    private String name;

    public iCat(){
        super(0,"unknown","Cat","omnivore","unknown");
        this.name="unknown";
    }
    public iCat(int Age, String Color, String Status, String name){
        super(Age, Color, "Cat", "omnivore", Status);
        this.name=name;
    }
    public void setName(String a){
        this.name=a;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return super.toString()+", (Name: "+this.getName()+")";
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this==obj) return true;
        if(!super.equals(obj)) return false;
        iCat c =(iCat) obj;
        return super.equals(c)&&this.getName().equals(c.getName());
    }
    public void speak(){
        System.out.println("Meow Meow......");
    }
}
