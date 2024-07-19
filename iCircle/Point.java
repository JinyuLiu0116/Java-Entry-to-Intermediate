package com.mac190.midternReview;

public class Point {

    private double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double a) {
        setX(a);
        setY(a);
    }

    public Point(double a, double b) {
        setXAndY(a, b);
    }

    //copy constructer
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double a) {
        this.x = a;
    }

    public void setY(double b) {
        this.y = b;
    }

    public void setXAndY(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public String toString() {
        return "(X: "+ x + ", Y: " + y + ")";
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point p = (Point) obj;
        return (this.x == p.x && this.y == p.y);
    }

    public Point add(double a) {
        Point p = new Point(this.x + a, this.y + a);
        return p;
    }

    public Point add(Point obj) {
        Point p = new Point(this.x + obj.x, this.y + obj.y);
        return p;
    }

    public double Distance(Point a) {
        return Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2));
    }

}
