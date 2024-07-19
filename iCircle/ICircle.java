package com.mac190.iCircle;

import com.mac190.midternReview.Point;

public class ICircle extends Point {
    private double radius;

    public ICircle(){
        super();
        this.radius=0;
    }
    public ICircle(Point p,double a){
        super(p);
        this.radius=a;
    }
    public ICircle(ICircle c){
        this.setCenter(c.getCenter());
        this.setRadius(c.getRadius());
    }
    public Point getCenter() {
        return this;
    }
    public void setCenter(Point p){
        this.setX(p.getX());
        this.setY(p.getY());
    }
    public ICircle(double X, double Y, double radius){
        super(X,Y);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double a){
        this.radius=a;
    }
    public String toString(){
        return super.toString()+" R: "+this.getRadius()+")";
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof ICircle)) return false;
        ICircle c=(ICircle) obj;
        return super.equals(c)&&this.getRadius()==c.getRadius();
    }
    public ICircle add(double a){
        return new ICircle(super.add(a),this.getRadius());
    }
    public double area(){
        return Math.PI*Math.pow(this.getRadius(),2);
    }
}