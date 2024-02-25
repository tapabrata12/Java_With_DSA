package _1_Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Printing_Text_and_variable_together {
    public static void main(String[] args) {
        int a = 3, b = 8, z = 10;
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

        System.out.println("Hello "+a+b+z);

        /*
        One thing is to be note that in print() method, strings are read left to right print(-->-->- Left to right -->--->-)
        if a single text will appear with numbers then by rule all thing will be treated as text.

        Lets breakdown it further
            println("Hello "+a+b+z)

            Step 1:
                 While reading left to right control encounters the string first and make whole as a string
                 println("Hello ""a""b"z")

            Step 2:
                 It merges the all into a single string
                 println("Hello abz") [And because of the variables are also string now, the + operator concatenate the whole string a+b+z ---> abz]

            Step 3:
                 It prints   "Hello 3810" [a = 3, b = 8, z = 10]
        */

        System.out.println(a+"Hello"+b+z);
        /*
        Lets breakdown the things how computer evaluate these.

        Step 1:
            When it evaluates println(a+"Hello"+b+z) from left to right then at first it sees a as a string (Field) because a + "Hello"
            and evaluate
            ("3Hello" +b+z)

        Step 2:
            After that all thing same as previous computer sees ("3Hello"+a+z) as
            ("3Hello"+"b"+"z") [More concisely at first it converts b and z as "b" and "z"]

        Step 3:
            At last it merges these strings into a single one "5Hellobz" which will be -> "3Hello810" [a = 3, b = 8, z = 10]
        */
        System.out.println(a+b+"Hello"+z);

        /*
         Lets breakdown the things how computer evaluate these.
          Step 1:
            When computer evaluates println(a+b+"Hello"+z) from left to right then at first it calculates a+b as a fields (variables) because till now it doesn't
            encounter the string part, and evaluate println([a+b]+"Hello"+z) --> Here bracket means at first sum will of a+b will be replaced to that place.

          Step 2:
             After that println([a+b]+"Hello"+z) when it encounters the string then same as the previous at first it converts [a+b] to "[a+b]"
             and merge with "Hello" and make
             println("[a+b]Hello"+z)

          Step 3:
            And at last z will be converted to string "z" and merge with  "[a+b]Hello" and give println("[a+b]Helloz")
            Here it will be --> "11Hello10"
         */
        System.out.println(a+b+z+"Hello"); // I hope now we can all evaluate this thing. Answer --> "21Hello"

        /*
        One more thing even a single string can do this if we leave a string empty then also the same rule will follow
         */

        System.out.println("Hello"+"Hello"); // print --> "HelloHello"

    }
}
