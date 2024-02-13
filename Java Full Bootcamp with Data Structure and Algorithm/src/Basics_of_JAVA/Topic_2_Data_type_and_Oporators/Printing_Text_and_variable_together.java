package Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Printing_Text_and_variable_together {
    public static void main(String[] args) {
        int a = 3;
        // To print text and value together we have two options one is,
        System.out.print("The value of a is: "); // Omitting ln
        System.out.println(a); // This is little bit lengthy method

        // And the next and right method is to use '+' operator we this + operator also comes with many rules we will look after
        System.out.println("The value of a is: "+a);

        /*

        When we put + before or after a string then this + operator will act as concatenate operator and if we put + between two numerical values then it will act as addition operator
        Steps:
        "The value of a is: "+a  --> After reading that it string, + operator at first convert a into "a" [variable a as a text] and then concatenates with "The value of a is: "

        */
    }
}
