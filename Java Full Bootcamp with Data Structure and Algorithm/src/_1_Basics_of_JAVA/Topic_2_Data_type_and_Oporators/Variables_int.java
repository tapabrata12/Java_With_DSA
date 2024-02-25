package _1_Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Variables_int {
    public static void main(String[] args) {
        /*

        Variables are containers that store information that can be manipulated and referenced later by the programmer within the code.
        Java variables have a data type associated with them which can tell us about the size and layout of the variable’s memory

        */

        // Syntax of declaring variable with int Datatype (Store only integer value)
        // Another thing is when we write int datatype 4 bytes will allocate from memory that's mean size of int datatype is 4 byte

        /*
         datatype variable = value
         */
        /* When we create any kind of variable, the space (In this case 4 bytes) for required Datatype variable is allocated from RAM (Main memory)*/
        int x = 10;

        System.out.println(x); // This will print 10

        // Update value. We can edit old value and reassign new value
        // ' = ' This is assignment operator who assign the value in a variable
        x = 5;
        System.out.println(x);

        // Variable arithmetic
        System.out.println(x+1); // Add 1 to the value of x and print that number

        int y = 10;
        System.out.println(y);

        y = y + 5; // This means update the y value with the previous value of y with adding 5
        System.out.println(y);

        y = y - 5; // This means update the y value with the previous value of y with subtracting 5
        System.out.println(y);
    }
}
