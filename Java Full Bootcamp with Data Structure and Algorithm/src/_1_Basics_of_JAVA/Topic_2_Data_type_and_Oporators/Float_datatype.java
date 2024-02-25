package _1_Basics_of_JAVA.Topic_2_Data_type_and_Oporators;

public class Float_datatype {

    /*
    In Java, the float data type is a primitive data type used to represent floating-point numbers. It is a 32-bit
    single-precision floating-point type, conforming to the IEEE 754 standard. Here are the key properties of the float
    data type:

    Size: The float data type is 32 bits in size, allowing it to store decimal numbers with up to 7 significant digits.

    Range: The range of float values is approximately ±3.4e-38 to ±3.4e+38, which means it can represent both very small
    and very large decimal numbers.

    Precision: float provides approximately 7 decimal digits of precision. This means that when you perform calculations,
    the results are accurate up to around 7 significant figures.

    Now, let's demonstrate some basic operations using float in Java:
    */
    public static void main(String[] args) {
        // Declare and initialize two float variables
        float num1 = 10.5f;
        float num2 = 5.2f;

        // Addition
        float sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        float difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        float product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        float quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);



        /*
        Now, let's discuss a drawback of the float data type - precision loss. Due to its limited precision (7 digits),
        float may encounter rounding errors, leading to imprecise results in some calculations. Here's an example:
        */
        // Declare and initialize two float variables
        float num3 = 1.23456789f;
        float num4 = 9.87654321f;

        // Add the numbers
        float sum1 = num3 + num4;

        // Print the result
        System.out.println("Sum: " + sum1);

        /*
        In this example, the result of the addition may not be as expected due to the limited precision of float.
        The output might be something like "Sum: 11.111112", which shows a small precision error. For scenarios where
        precise decimal representation is critical, the double data type, with its higher precision (64 bits), might be
        more suitable than float.
        */
    }
}
