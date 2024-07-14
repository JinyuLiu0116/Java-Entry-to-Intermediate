package com.mac190.oopPractice.point_circle;

public class Point {
    private double X, Y;

    public Point() {
        this.X = 0;
        this.Y = 0;
    }

    public Point(double a) {
        this.X = a;
        this.Y = a;
    }

    public Point(Point obj) {
        this.X = obj.X;
        this.Y = obj.Y;
    }

    public Point(double a, double b) {
        this.X = a;
        this.Y = b;
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public void setX(double a) {
        this.X = a;
    }

    public void setY(double a) {
        this.Y = a;
    }

    public String toString() {
        return "(" + X + ", " + Y + ")";
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return this.X == p.X && this.Y == p.Y;
    }

    public Point add(double a) {
        return new Point(this.X + a, this.Y + a);
    }

    public Point add(double a, double b) {
        return new Point(this.X + a, this.Y + b);
    }

    public Point add(Point obj) {
        return new Point(this.X + obj.X, this.Y + obj.Y);
    }

    public double Distance(Point obj) {
        return Math.sqrt(Math.pow(this.X - obj.X, 2) + Math.pow(this.Y - obj.Y, 2));
    }
}
