package com.mac190.midternReview;

public class Circle {

    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point(0);
        this.radius = 0;
    }

    public Circle(Point obj, double a) {
        setCenter(obj);
        setRadius(a);
    }

    public Circle(double a, double b, double r) {
        setCenter(a, b);
        setRadius(r);
    }

    public Point getCenter() {
        Point p = new Point(this.center.getX(), this.center.getY());
        return p;
    }

    public double getX() {
        return this.center.getX();
    }

    public double getY() {
        return this.center.getY();
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(double a, double b) {
        this.center = new Point(a, b);
    }

    public void setCenter(Point obj) {
        this.center = new Point(obj.getX(), obj.getY());
    }

    public void setX(double d) {
        this.center.setX(d);
    }

    public void setY(double d) {
        this.center.setY(d);
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public String toString() {
        return this.center.toString() + ", r:" + this.radius;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle c = (Circle) obj;
        return this.center.equals(c.center) && this.radius == c.radius;
    }

    /*

 -Method double area(Point p) returns the area of the circle
 -Test your class.*/
    public Circle add(double a) {
        Point p = this.center.add(a);
        Circle c = new Circle(p, this.radius);
        return c;
    }

    public Circle add(Point obj) {
        Point p = this.center.add(obj);
        Circle c = new Circle(p, this.radius);
        return c;
    }

    public Circle add(Circle c) {
        Circle circle = new Circle((this.center.add(c.getCenter())), (this.radius + c.radius));
        return circle;
    }
    //public double area(Point p){
    //}


}
