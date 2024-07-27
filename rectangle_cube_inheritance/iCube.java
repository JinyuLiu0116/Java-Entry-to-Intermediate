package com.mac190.rectangle_cube;

public class iCube extends Rectangle {
    private double height;

    public iCube() {
        super();
        this.height = 0;
    }
    public iCube(Rectangle r, double a) {
        super(r);
        this.setHeight(Math.abs(a));
    }
    public iCube(double a, double b, double c) {
        super(a,b);
        this.setHeight(Math.abs(c));
    }
    public iCube(iCube c) {
        super(c.getBase());
        this.setHeight(c.getHeight());
    }
    public Rectangle getBase() {
        return this;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double a) {
        this.height = Math.abs(a);
    }
    public void setBase(double a) {
        this.setLength(a);
        this.setWidth(a);
    }
    public String toString() {
        return super.toString() + ", H:" + this.getHeight() + ")";
    }
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof iCube)) return false;
        iCube c = (iCube) obj;
        return super.equals(c.getBase()) && this.getHeight() == c.getHeight();
    }
    public double Volume() {
        return super.area() * this.getHeight();
    }
    public iCube add(iCube c) {
        return new iCube(super.add(c.getBase()), this.getHeight() + c.getHeight());
    }
    public iCube multiply(double a) {
        return new iCube(super.multiply(Math.abs(a)), this.getHeight() * Math.abs(a));
    }
}