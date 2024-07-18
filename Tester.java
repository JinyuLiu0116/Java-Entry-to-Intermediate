package rectangleAndCube;

public class Tester {
    public static void main(String[] args){
        Cube c1=new Cube();
        System.out.println("c1:"+c1);

        Rectangle r1=new Rectangle(6,7);
        System.out.println("r1:"+r1);

        Cube c2=new Cube(r1,11);
        System.out.println("c2:"+c2);

        Cube c3=new Cube(3,-4,9);
        System.out.println("c3:"+c3);

        Cube c5=new Cube(c2);
        System.out.println("c5:"+c5);

        System.out.println("c3,base:"+c3.getBase());

        System.out.println("c2, length:"+c2.getLength());
        System.out.println("c1, width:"+c1.getWidth());
        c3.setHeight(12);
        System.out.println("c3, height:"+c3.getHeight());
        System.out.println("c3:"+c3);

        c1.setBase(-3);
        System.out.println("c1,base:"+c1.getBase());
        c2.setLength(15);
        System.out.println("c2, length:"+c2.getLength());
        c3.setWidth(-20);
        System.out.println("c3, width:"+c3.getWidth());
        if(c3.equals(c2))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");

        System.out.println("volume of c3:"+c3.Volume());

        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
        Cube c4=new Cube(c1.add(c2));//bug
        System.out.println("c4:"+c4);

        c5=c5.multiply(-3.5);
        System.out.println("c5"+c5);

        System.out.println("c1:"+c1);
        System.out.println("c2"+c2);


    }
}
