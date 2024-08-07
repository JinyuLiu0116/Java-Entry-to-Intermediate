package untitled.src.finalexam;

import java.util.Objects;

public abstract class Furniture {
   protected double Height;
   protected int Legs,Drawers;
   private int  Year;
   private String Wood;

   public Furniture()throws Exception{
      this.Wood="Unknown";
      this.Height=1;
      Legs=Drawers=0;
      this.Year=1;
   }
   public Furniture(String wood,double height,int legs,int drawers,int year)throws Exception{
      this.setWood(wood);
      this.setHeight(height);
      this.setLegs(legs);
      this.setDrawers(drawers);
      this.setYear(year);
   }
   public String getWood(){return this.Wood;}
   public double getHeight(){return this.Height;}
   public int getLegs(){return this.Legs;}
   public int getDrawers(){return this.Drawers;}
   public int getYear(){return this.Year;}

   public void setWood(String w){this.Wood=w;}
   public void setDrawers(int d)throws Exception {
      if(d<0){
         throw new Exception("Cannot have negative number of Drawer!");
      }else {
         this.Drawers = d;
      }
   }
   public void setHeight(double h)throws Exception {
      if(h<1){
         throw new Exception("Cannot have Height less then 1!");
      }else {
         this.Height = h;
      }
   }
   public void setLegs(int l)throws Exception {
      if(l<3){
         throw new Exception("Cannot have number of legs less then 3!");
      }else{
         this.Legs=l;
      }
   }
   public void setYear(int y)throws Exception{
      if(y<0){
         throw new Exception("Cannot have negative number of year!");
      }else{
         this.Year=y;
      }
   }

   @Override
   public String toString() {
      return "Furniture{" +
              "Height=" + Height +
              ", Legs=" + Legs +
              ", Drawers=" + Drawers +
              ", Year=" + Year +
              ", Wood='" + Wood + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if(o==null) return false;
      if (this == o) return true;
      if (!(o instanceof Furniture)) return false;
      Furniture furniture = (Furniture) o;
      return Legs == furniture.Legs && Drawers == furniture.Drawers && Year == furniture.Year && this.getWood().equals(furniture.getWood());
   }
   public Furniture increment(int i)throws Exception{
      this.setHeight(this.getHeight()+i);
      return this;
   }
   abstract public Furniture resize(double factor)throws Exception;

}
