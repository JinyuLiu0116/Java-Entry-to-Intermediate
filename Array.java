package selfPractice.array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String[] student = new String[3];
        int[] grade = new int[3];
        for(int i=0; i<student.length; i++)
        {
            System.out.print("Enter the name of student"+(i+1)+":");
            student[i] = keyb.nextLine();
            System.out.print("Enter the grade for "+student[i]+":");
            grade[i] = keyb.nextInt();
            keyb.nextLine();
        }
        for(int i=0; i<student.length; i++)
        {
            System.out.println(student[i]+": "+grade[i]);
        }

    }
}
