package com.mac190.employee;

public class Employee {
    private String name;
    private int workHours, years;
    private double hourlySalary,weeklySalary;

    public Employee(){
        this.name="";
        this.years=0;
        this.workHours=0;
        this.hourlySalary=17;
        this.weeklySalary=0;
    }
    public Employee(String name, int years, int hours){
        this.name=name;
        if(years>=0&&hours>=0) {
            this.years = years;
            this.workHours = hours;
        }else{
            System.out.println("Cannot be negative number.");
        }
        this.hourlySalary=17;
        this.setWeeklySalary(this.getWorkHours());
    }
    public Employee(Employee e){
        this.name=e.getName();
        this.years=e.getYears();
        this.workHours=e.getWorkHours();
        this.hourlySalary=e.getHourlySalary();
        this.weeklySalary=e.getWeeklySalary();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setYears(int years){
        this.years=years;
    }
    public int getYears(){
        return this.years;
    }
    public void setWorkHours(int hours){
        this.workHours=hours;
    }
    public int getWorkHours(){
        return this.workHours;
    }
    private void setHourlySalary(double hourly){
        this.hourlySalary=hourly;
    }
    public double getHourlySalary(){
        return this.hourlySalary;
    }
    public void setWeeklySalary(int hours){
        if(hours<=40){
            this.weeklySalary=hours*this.getHourlySalary();
        }else {
            this.weeklySalary=40*this.getHourlySalary()+(hours-40)*1.5*this.getHourlySalary();
        }
    }
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    public String toString(){
        return "(Name: "+this.getName()+"\nYears: "+this.getYears()+"\nWorking hours: "+this.getWorkHours()+
                "\nHourly salary: "+this.getHourlySalary()+"\nWeekly salary: "+this.getWeeklySalary()+')';
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee e=(Employee) obj;
        return this.getName().equals(e.getName())&&this.getYears()==e.getYears()&&this.getWorkHours()==e.getWorkHours()&&
                this.getHourlySalary()==e.getHourlySalary()&&this.getWeeklySalary()==e.getWeeklySalary();
    }
    public void Promotion(){
        if(this.getYears()>=3){
            System.out.println(this.getName()+" get promoted.");
            this.setHourlySalary(this.getHourlySalary()*1.3);
        }else if(this.getYears()>=5){
            System.out.println(this.getName()+" get promoted.");
            this.setHourlySalary(this.getHourlySalary()*1.5);
        }else if(this.getYears()>=10){
            System.out.println(this.getName()+" get promoted.");
            this.setHourlySalary(this.getHourlySalary()*1.8);
        }
        System.out.println(this.getName()+" do not get promoted.");
    }
}
