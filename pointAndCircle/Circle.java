package selfPractice.pointAndCircle;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point obj, double a) {
        this.setCenter(obj);
        this.radius = a;
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

    public void setCenter(Point obj) {
        this.center.setX(obj.getX());
        this.center.setY(obj.getY());
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

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle c = (Circle) obj;
        return this.center.equals(c.getCenter()) && this.radius == c.radius;
    }

    public Circle add(double a) {
        return new Circle(this.center.add(a), this.getRadius() + a);
    }

    public Circle add(Point p) {
        return new Circle(this.center.add(p), this.getRadius());
    }

    public Circle add(Circle c) {
        return new Circle(this.center.add(c.getCenter()), this.getRadius() + c.getRadius());
    }

    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
