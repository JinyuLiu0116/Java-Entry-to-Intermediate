package com.mac190.oopPractice.point_circle;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point obj, double radius) {
        this.center = new Point(obj);
        this.radius = radius;
    }

    public Circle(double a, double b, double c) {
        this.center = new Point(a, b);
        this.radius = c;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getX() {
        return this.center.getX();
    }

    public double getY() {
        return this.center.getY();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setX(double a) {
        this.center.setX(a);
    }

    public void setY(double a) {
        this.center.setY(a);
    }

    public void setRadius(double a) {
        this.radius = a;
    }

    public String toString() {
        return "{(" + this.center.getX() + ", " + this.center.getY() + "), " + this.radius + "}";
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle c = (Circle) o;
        return this.center.equals(c.center) && this.radius == c.radius;
    }

    public Circle add(double a) {
        return new Circle(this.center.add(a), this.radius + a);
    }

    public Circle add(Point p) {
        return new Circle(this.center.add(p), this.radius);
    }

    public Circle add(Circle c) {
        return new Circle(this.center.add(c.getCenter()), this.radius + c.radius);
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
