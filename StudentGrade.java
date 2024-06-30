package com.mac190.practice1;
import java.util.Scanner;

public class StudentGrade { public static final int SIZE = 5;
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        String name="";
        String[] subjects = {"Englis", "Math", "CS", "Science", "Gym"};
        double[] grade = new double[SIZE];
        double total=0, average;
        char letterGrade;

        System.out.print("Enter student's name: ");
        name = keyb.nextLine();
        System.out.println("Hello "+name+", please enter your scores:");
        for(int i=0; i<SIZE; i++)
        {
            System.out.print((i+1)+"."+subjects[i]+":");
            grade[i] = keyb.nextDouble();
            if(grade[i]<0 || grade[i]>100)
            {
                System.out.println("Invalid input number, please enter your score again.");
                System.out.print((i+1)+"."+subjects[i]+":");
                grade[i] = keyb.nextDouble();
            }
            total += grade[i];
        }
        average = total / SIZE;
        if(average > 91 && average < 100)
            letterGrade = 'A';
        else if(average > 81 && average < 90)
            letterGrade = 'B';
        else if(average > 71 && average < 80)
            letterGrade = 'C';
        else if(average > 61 && average < 70)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        System.out.println("Student: "+name);
        System.out.println("  Total: "+total);
        System.out.println("Average: "+average);
        System.out.println("  Grade: "+letterGrade);
    }

}
