package Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Redeclaration_of_a_variable {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(a);
        System.out.println(b);

        b = 2; // Declaration of the same variable in multiple times with a new value
        System.out.println(b); // Print 2

        b = a + b; //  We can declare multiple times
        System.out.println(b); // Print 7
    }
}
