package com.mac190.vehicle;

public class BMW extends Vehicle implements iDrive{

    private String FuelType;
    private int numPassengers;
    public BMW(){
        super("BMW","Unknown",0,0, 0);
        this.numPassengers=0;
        this.FuelType="Unknown";
    }
    public BMW(String type,String color,int year,int power,int vin,int passengers){
        super("BMW",color,year,power, vin);
        this.numPassengers=passengers;
        this.FuelType=type;
    }

    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int a){
        this.numPassengers=a;
    }
    public String getFuelType(){
        return this.FuelType;
    }
    public void setFuelType(String a){
        this.FuelType=a;
    }
    public String toString(){
        return super.toString()+" "+this.getMake()+"("+this.getFuelType()+". "+this.getNumPassengers()+")";
    }

    public void moveForward(){
        System.out.println(this.getMake()+" is moving forward.");
    }
    public void moveBackwards(){
        System.out.println(this.getMake()+" is moving backward.");
    }
    public void turnLeft(double degrees){
        System.out.println(this.getMake()+" turn left "+degrees+" degree.");
    }
    public void turnRight(double degrees){
        System.out.println(this.getMake()+" turn right "+degrees+" degree.");
    }
    public void ChangeSpeed(double s){
        System.out.println(this.getMake()+" changes speed to "+s+" mph.");
    }
    public void Brake(){
        System.out.println(this.getMake()+" is stopped.");
    }
}
