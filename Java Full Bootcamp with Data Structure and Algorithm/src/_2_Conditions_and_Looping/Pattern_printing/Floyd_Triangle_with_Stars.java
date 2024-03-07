package _2_Conditions_and_Looping.Pattern_printing;

import java.util.Scanner;

public class Floyd_Triangle_with_Stars {
    public static void main(String[] args){
        int lines;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        lines = input.nextInt();
        for (int rows = 1; rows <= lines; rows++) {
            for (int col = 1; col <=rows ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Alternative Method
        for (int rows =lines; rows>=1 ; rows--) {
            for (int col =lines ;col>=rows  ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
