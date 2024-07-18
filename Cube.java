package rectangleAndCube;

public class Cube{
    private Rectangle base;
    private double height;

    public Cube(){
        this.base=new Rectangle();
        this.height=0;
    }
    public Cube(Rectangle r, double a){
        double side = this.setSideOfCube(r.getLength(),r.getWidth(),a);
        this.base=new Rectangle(side,side);
        this.height=side;
    }
    public Cube(double a, double b, double c){
       double side = this.setSideOfCube(a,b,c);
        this.base=new Rectangle(side,side);
        this.height=side;
    }
    public Cube(Cube c){
        this.base=new Rectangle(c.getBase());
        this.base.setWidth(c.base.getWidth());
        this.height=c.getHeight();
    }
    public double setSideOfCube(double a,double b, double c){
        return (Math.abs(a)+Math.abs(b)+Math.abs(c))/3;
    }
    public Rectangle getBase(){
        return this.base;
    }
    public double getLength(){
        return this.base.getLength();
    }
    public double getWidth(){
        return this.base.getWidth();
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double a){
        a=Math.abs(a);
        this.height=a;
        if(this.base.getLength()!=a)
            this.base.setLength(a);
        if(this.base.getWidth()!=a)
            this.base.setWidth(a);
    }
    public void setBase(double a){
        a=Math.abs(a);
        this.base.setLength(a);
        this.base.setWidth(a);
        if(this.height!=a)
            this.setHeight(a);
    }
    public void setLength(double a){
        a=Math.abs(a);
        this.base.setLength(a);
        if(this.base.getWidth()!=a)
            this.base.setWidth(a);
        if(this.getHeight()!=a)
            this.height=a;
    }
    public void setWidth(double a) {
        a = Math.abs(a);
        this.base.setWidth(a);
        if (this.base.getLength() != a)
            this.base.setLength(a);
        if (this.getHeight() != a)
            this.height = a;
    }
    public String toString(){
        return "(L:"+this.getHeight()+", W:"+this.getWidth()+", H:"+this.getHeight()+")";
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Cube)) return false;
        Cube c=(Cube)obj;
        return this.base.equals(c.getBase())&&this.getHeight()==c.getHeight();
    }
    public double Volume(){
        return this.base.area()*this.getHeight();
    }
    public Cube add(Cube c){
        return new Cube(this.base.add(c.base),this.getHeight()+c.getHeight());
    }
    public Cube multiply(double a){
        return new Cube(this.base.multiply(Math.abs(a)), this.getHeight()*Math.abs(a));
    }
}
