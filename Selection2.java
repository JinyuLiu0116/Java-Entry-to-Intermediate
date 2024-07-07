package com.mac190.practice1;

import java.util.Scanner;

public class Selection2 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter four numbers:");
        a = keyb.nextInt();
        b = keyb.nextInt();
        c = keyb.nextInt();
        d = keyb.nextInt();
        if (a <= b && b <= c && c <= d)
            System.out.println(a + " " + b + " " + c + " " + d);
        else if (a <= b && b <= d && d <= c)
            System.out.println(a + " " + b + " " + d + " " + c);
        else if (a <= c && c <= b && b <= d)
            System.out.println(a + " " + c + " " + b + " " + d);
        else if (a <= c && c <= d && d <= b)
            System.out.println(a + " " + c + " " + d + " " + b);
        else if (a <= d && d <= c && c <= b)
            System.out.println(a + " " + d + " " + c + " " + b);
        else if (a <= d && d <= b && b <= c)
            System.out.println(a + " " + d + " " + b + " " + c);
        else if (b <= a && a <= c && c <= d)
            System.out.println(b + " " + a + " " + c + " " + d);
        else if (c <= a && a <= b && b <= d)
            System.out.println(c + " " + a + " " + b + " " + d);


    }
}
