package _2_Conditions_and_Looping.Pattern_printing;

import java.util.Scanner;

public class Up_side_down_Floyd_Triangle_with_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line no: ");
        int line = scanner.nextInt();

        for (int row = line; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // Alternative approach

        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= line+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // Alternative approach

        for (int row = 1; row <= line; row++) {
            for (int col = line; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
