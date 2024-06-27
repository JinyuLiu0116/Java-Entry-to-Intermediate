package selfPractice.loop;

import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int row;
        int colum;
        char symbol;
        System.out.print("Enter the row:");
        row = keyb.nextInt();
        System.out.print("Enter the colum: ");
        colum = keyb.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = keyb.next().charAt(0);

        for(int i=1;i<=colum; i++)
        {
            for(int j=1; j <= row; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
