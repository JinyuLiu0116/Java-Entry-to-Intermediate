package untitled.src.finalexam;

public class Desk extends Furniture implements iFurniture{
    private double Length, Width;

    public Desk()throws Exception{
        super("Unknown",28,4,1,1);
        this.Length=24;
        this.Width=16;
    }
    public Desk(String wood,double height,int legs,int drawers,int year,double length,double width)throws Exception{
        this.setWood(wood);
        this.setHeight(height);
        this.setLength(length);
        this.setWidth(width);
        this.setLegs(legs);
        this.setYear(year);
        this.setDrawers(drawers);
    }
    public double getLength(){return this.Length;}
    public double getWidth(){return this.Width;}

    public void setLegs(int l)throws Exception{
        if(l!=4){
            throw new Exception("Desk must and can only have 4 legs!");
        }else{
            this.Legs=4;
        }
    }
    public void setHeight(double h)throws Exception{
        if(h<28||h>32){
            throw new Exception("Height only between 28 and 32 inches!");
        }else{
            this.Height=h;
        }
    }
    public void setLength(double l)throws Exception{
        if(l<24||l>60){
            throw new Exception("Length can only between 24 and 60 inches!");
        }else{
            this.Length=l;
        }
    }
    public void setWidth(double w)throws Exception{
        if(w<16||w>30){
            throw new Exception("Width can only between 28 and 32 inches!");
        }else{
            this.Width=w;
        }
    }
    public void setDrawers(int d)throws Exception{
        if(d<1){
            throw new Exception("Desk cannot has drawers less then 1!");
        }else{
            this.Drawers=d;
        }
    }
    public String toString(){
        return " Desk(Length: "+this.getLength()+", Width: "+this.getWidth()+")"+super.toString();
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(super.equals(obj))) return false;
        Desk d=(Desk) obj;
        return super.equals(d)&&this.getWidth()==d.getWidth()&&this.getLength()==d.getLength();
    }
    public Furniture resize(double factor)throws Exception {
        Furniture f= new Desk(this.getWood(), this.getHeight() * factor, this.getLegs(), this.getDrawers()
                , this.getYear(), this.getLength() * factor, this.getWidth() * factor);
        return f;

    }
}
