package _2_Conditions_and_Looping.Pattern_printing;

import java.util.Scanner;

public class Rectangle_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();

        for (int row = 1; row <=lines; row++) {
            for (int col = 1; col <=lines ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
