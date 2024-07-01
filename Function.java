package selfPractice.function;
import java.util.Scanner;
public class Function {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyb.nextInt();

        //print top of the diamond pattern
        for(int i = 1; i <=num; i++)
        {
            for(int j =1; j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <=num-1; i++)
        {
            for(int j =1; j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=num-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
