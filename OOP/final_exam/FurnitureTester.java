package untitled.src.finalexam;

public class FurnitureTester {
    public static void main(String[] args) {
        try{
            Furniture f1=new Desk();
            System.out.println("f1: "+f1);
            Desk d1=new Desk("oak",28,4,2,2,24.5,18.5);
            System.out.println("d1: "+d1);
            f1.setHeight(30);
            f1.setYear(10);
            f1.setDrawers(4);
            f1.setLegs(4);
            f1.setWood("ash");
            System.out.println("f1: "+f1);
            iFurniture iF=d1;
            Furniture f2=d1;
            if(iF.equals(f2)){
                System.out.println("iF equals to f2");
            }else{
                System.out.println("if not equals to f2");
            }
            iF.setLength(59);
            iF.setWidth(29);
            System.out.println("iF: "+iF);
            f2=iF.increment(2);
            System.out.println("f2: "+f2);
            f2=d1.resize(1.001);
            System.out.println("f2: "+f2);


        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
