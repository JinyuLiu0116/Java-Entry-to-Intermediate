package selfPractice.classes;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Classes {
    Scanner keyb = new Scanner(System.in);
    final static int SIZE = 5;
    String name;
    String[] subject = {"English", "Math", "CS", "Art", "Gym"};
    int[] grade = new int[SIZE];
    int total=0;
    double average;
    char letterGrade;
    //methods
    void setName()
    {
        name = keyb.nextLine();
    }
    void getInput()
    {
        for(int i=0; i<SIZE;i++)
        {
            System.out.print((i+1)+"."+subject[i]+": ");
            grade[i]=keyb.nextInt();
            total+=grade[i];
        }
        average=total/SIZE;
        if(average>90)
            letterGrade = 'A';
        else if (average > 80)
            letterGrade = 'B';
        else if (average > 70)
            letterGrade = 'C';
        else if (average > 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

    }
    void display()
    {
        System.out.print("Student name:"+name);
        System.out.println();
        System.out.print("Total score:"+total);
        System.out.println();
        System.out.print("Average:"+average+"%");
        System.out.println();
        System.out.print("Letter Grade:"+letterGrade);

    }
}
