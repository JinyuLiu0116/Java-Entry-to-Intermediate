import java.util.Scanner;
import java.util.Random;
public class Math_class {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x=10.23;
        double y=-11.5;

        double z=Math.max(x, y);//find the larger of these two numbers.
        System.out.println(z);
     
        System.out.println(Math.min(x, y));

        z=Math.abs(y);
        System.out.println("The absolute value of y(-11.5) is: "+z);

        z=Math.sqrt(x);
        System.out.println("The square root of x(10.23) is: "+z);

        System.out.println("Round x(10.23) is: "+Math.round(x)+", ceiling round x is: "+Math.ceil(x)+", the floor round x is: "+Math.floor(x));
        //project to colculate the hypotenuse of a triangle
        double a,b,c;

        System.out.print("Enter the side a: ");
        a=scanner.nextDouble();
        
        System.out.print("Enter the side b: ");
        b=scanner.nextDouble();

        c=Math.sqrt(a*a+b*b);
        System.out.println("The hypotenuse is: "+c);

        scanner.close();//close canner, not necessary, but good for practice.
        //use random to assign value of the sides.
        Random random=new Random();

        int n=random.nextInt(10)+5;
        System.out.println("The side n is: "+n);

        int m=random.nextInt(12)+5;
        System.out.println("The side m is: "+m);

        double r=Math.sqrt(n*n+m*m);
        System.out.println("The hypotenuse is: "+r);


    }
}
