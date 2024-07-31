package com.mac190.vehicle;

public abstract class Vehicle {
    private String Make, Color;
    private int YearMade, HorsePower, VIN;

    public Vehicle(){
        this.Make="Unknown";
        this.Color="Unknown";
        this.YearMade=0;
        this.HorsePower=0;
        this.VIN=0;
    }
    public Vehicle(String make,String color,int year,int power,int vin){
        this.Make=make;
        this.Color=color;
        this.YearMade=year;
        this.HorsePower=power;
        this.VIN=vin;
    }

    public String getMake() {
        return Make;
    }

    public String getColor() {
        return Color;
    }

    public int getYearMade() {
        return YearMade;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public int getVIN() {
        return VIN;
    }

    public void setMake(String make) {
        Make = make;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setYearMade(int yearMade) {
        YearMade = yearMade;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }
    public String toString(){
        return "Vehicle ("+this.getColor()+", "+this.getMake()+", "+this.getHorsePower()+
                ", "+this.getVIN()+", "+this.getYearMade()+")";
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Vehicle)) return false;
        Vehicle v=(Vehicle) obj;
        return this.getVIN()==v.getVIN()&&this.getYearMade()==v.getYearMade()&&this.getHorsePower()==v.getHorsePower()&&
                this.getMake().equals(v.getMake())&&this.getColor().equals(v.getColor());
    }
    abstract void moveForward();
    abstract void moveBackwards();
    abstract void turnLeft(double degrees);
    abstract void turnRight(double degrees);
    abstract void ChangeSpeed(double s);
    abstract void Brake();
    /*
Design a class Vehicle that has the following:
Make  string
YearMade
HorsePower
VIN
Color string

setters/getters/constructors/ equals/toString()


You want to force all Vehicles to implement a way to (abstract methods)
- moveForward()
- moveBackwards()
- TrunLeft(double degees)
- turnRight(double degrees)
- ChangeSpeed(double s)
- Brake()


 */
}
