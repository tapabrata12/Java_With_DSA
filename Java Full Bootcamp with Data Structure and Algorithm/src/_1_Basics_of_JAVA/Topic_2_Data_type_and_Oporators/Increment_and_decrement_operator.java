package _1_Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Increment_and_decrement_operator {
    public static void main(String[] args) {
        int x = 10,y = 1;
        // These will be very sort thing
        /* Increment and decrement operator has two parts
                     1) Pre 2) Post
        */

        // Post-Increment in simple word is first use and then increase


        System.out.println(y++); // It prints 1 as per rule first use
        y--; // Re-adjust the value
        // Pre-Increment in simple word is first Increase and then use

        System.out.println(++y); // It prints 2 as per first increment rule

        // Some extra in Increment


        System.out.println(x);
        x++; // x = x+1

        System.out.println(x);
        x+=2; // x = x+2
        System.out.println(x);
        x+=3; // x=x+3
        System.out.println(x);
        // Just like this so on and so on.........


       // Post-Decrement in simple word is first use and then Decrease


        System.out.println(y--); // It prints 1 as per rule first use
        y++; // Re-adjust the value
        // Pre-Decrement in simple word is first Decrease and then use

        System.out.println(--y); // It prints 0 as per first decrement rule

        // Some extra in Decrement

        System.out.println(x);
        x--; // x = x-1

        System.out.println(x);
        x-=2; // x = x-2
        System.out.println(x);
        x-=3; // x=x-3
        System.out.println(x);
        // Just like this so on and so on.........
    }
}
