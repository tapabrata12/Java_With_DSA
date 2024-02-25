package _1_Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Printing_numbers {
    public static void main(String[] args) {
        System.out.println("4"); // Will be treated as a string (text) this 4 has no value in itself
        System.out.println(4); // Will be treated as a normal value
        System.out.println("4+3"); // Sum will not be printed as 4+3 will be treated as a string (text)
        System.out.println(4+3); // Sum will be printed as now these will be treated as a number
        //  System.out.println(Hello world); // Through an error as text can't be converted in number we must write the text in double quotes
    }
}
