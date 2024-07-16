package selfPractice.pointAndCircle;

public class Point {
    private double X, Y;

    public Point() {
        this.X = 0;
        this.Y = 0;
    }

    public Point(double a) {
        setX(a);
        setY(a);
    }

    public Point(double a, double b) {
        setX(a);
        setY(b);
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
        return "(" + this.getX() + ", " + this.getY() + ")";
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return this.getX() == p.getX() && this.getY() == p.getY();
    }

    public Point add(double a) {
        return new Point(this.getX() + a, this.getY() + a);
    }

    public Point add(double a, double b) {
        return new Point(this.getX() + a, this.getY() + b);
    }

    public Point add(Point obj) {
        return new Point(this.getX() + obj.getX(), this.getY() + obj.getY());
    }

    public double Distance(Point obj) {
        return Math.sqrt(Math.pow(this.getX() - obj.getX(), 2) + Math.pow(this.getY() - obj.getY(), 2));
    }
}
