package Java_College_Programs.Day1;

class Hello{ // Defining a class same name as file so that it can refer which is the main class
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

/*
Doubt 1:

I create a java file with a name Hello.java and write the following code,

class Hello{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

It works perfectly and Give me Hello world.

Then I edit the class name hello keeping the file Hello.java

class hello{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

It also works perfectly and Give me Hello world.

Then I edit the class name gfhfhf keeping the file Hello.java

class gfhfhf{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

I astonish that It also works perfectly and Give me Hello world.

Now I add public keyword before the class Keeping remaining things same

public class hello{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

But this time it gives Sin tux error and Telling me to rename the class name to hello -> Hello as the file is Hello.java

Can you tell me what is going on ??

(ANS:)

In Java, the name of the Java file must match the name of the public class defined within that file. When you declare a class as public in Java, the name of the file must match the name of the public class.

Let's go through your scenarios:

1. When you changed the class name from `Hello` to `hello` and kept the filename `Hello.java`, it still worked. This is because Java is case-sensitive but not case-enforced for filenames, meaning the operating system file system may not care about the case of the filename. However, Java itself does care about case sensitivity for class names.

2. When you changed the class name to `gfhfhf`, it continued to work because Java doesn't enforce any naming restrictions on non-public classes. You can name them anything you want.

3. However, when you added the `public` keyword before the class declaration (`public class hello`), you are essentially saying that the class `hello` is now a public class. In Java, the rule is that if you have a public class, the name of the file must match the name of the public class exactly, including case sensitivity.

Therefore, if you name your class `hello`, the filename must be `hello.java`, not `Hello.java`. This is a rule imposed by Java to maintain consistency and to make it easier for developers to find and understand the code. It's part of Java's convention and compilation requirements.


*/

/*
I have  question that If I have a java file in that file I write multiple classes where I did not add public keyword to any of the classes and now I write my  public static void main(String[] args) function in one of that class, In java always that class will run first which have  public static void main(String[] args) function. Now My question is that can java find that class containig  public static void main(String[] args) function if yes then how ?

(ANS:-)

Yes, Java can find the class containing the `public static void main(String[] args)` function even if you don't declare the class as `public`. This is because the `main` method serves as the entry point for your Java application, and it doesn't matter if the class containing it is public or not.

When you run a Java application using the `java` command, you specify the name of the class that contains the `main` method as the entry point. Java then looks for the `main` method within that class and executes it. As long as the class is accessible (e.g., in the classpath and correctly compiled), Java will be able to find and execute the `main` method.

Here's a simple example to illustrate:

```java
class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

class AnotherClass {
    public static void main(String[] args) {
        System.out.println("Another Hello, world!");
    }
}
```

In this example, both `MyClass` and `AnotherClass` have `main` methods. If you compile this code and run it specifying `MyClass` as the entry point, Java will execute the `main` method in `MyClass`. If you specify `AnotherClass` as the entry point, Java will execute the `main` method in `AnotherClass`.

Remember, though, that in a real-world scenario, organizing your code and adhering to Java's conventions (like having one `main` method per application entry point) can make your code more readable and maintainable.
*/