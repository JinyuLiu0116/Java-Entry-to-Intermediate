package rectangleAndCube;

public class Rectangle {
    private double length, width;

    public Rectangle(){
        this.length=0;
        this.width=0;
    }
    public Rectangle(double a, double b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a>=b){
            this.length=a;
            this.width=b;
        }else{
            this.length=b;
            this.width=a;
        }
    }
    public Rectangle(Rectangle r){
        this.length=r.getLength();
        this.width=r.getWidth();
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
   public void setLength(double a){
        a=Math.abs(a);
        if(this.getWidth()==a||this.getWidth()>a)
            this.length=a;
        else{
            this.length=this.getWidth();
            this.width=a;
        }
    }
    public void setWidth(double a){
        a=Math.abs(a);
        if(this.getLength()==a||this.getLength()<a)
            this.width=a;
        else{
            this.width=this.getLength();
            this.length=a;
        }
    }
    public double area(){
        return this.getLength()*this.getWidth();
    }

    public double Perm(){
        return (this.getLength()+this.getWidth())*2;
    }
    public String toString (){
        return "(L:"+this.getLength()+", W:"+this.getWidth()+")";
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Rectangle)) return false;
        Rectangle r=(Rectangle)obj;
        return this.getLength()==r.getLength()&&this.getWidth()==r.getWidth();
    }
    public Rectangle add(Rectangle r){
        return new Rectangle(this.getLength()+r.getLength(),this.getWidth()+r.getWidth());
    }
    //method add() that accepts a double and returns a Rectangle with all sides augmented/reduced by the input. all side shoud remain positive
    public Rectangle add(double a){
        return new Rectangle(Math.abs(this.getLength()-a),Math.abs(this.getWidth()-a));
    }
    public Rectangle multiply(double a){
        return new Rectangle(this.getLength()*Math.abs(a),this.getWidth()*Math.abs(a));
    }

}
