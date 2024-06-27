package com.mac190.loops;

public class Loops {
    public static void main(String[] args) {
        // for loop
        for(int i = 5; i >0; i-=2){
            for(int j = i; j > 0; j--){
                System.out.println(i + " " + j);
            }
        }
        //output: 5 5 5 4 5 3 5 2 5 1
        //        3 3 3 2 3 1
        //        1 1
        //use while loop
        int i = 5;
        while(i>0)
        {
            int j = i;
            while (j>0)
            {
                System.out.println(i+" "+j);
                j--;
            }
            i-=2;
        }
        // use do while loop
        do {
            int j = i;
            do{
                System.out.println(i+" "+j);
                j--;
            }while(j>0);
            i-=2;
        }while(i>0);

    }
}
