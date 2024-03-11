package src;

import java.util.Scanner;

public class Methods {

    // Calculate factorial
    public static long calculateFactorial(int num) {

        if (num == 0 || num == 1) {
            return 1;
        } else {
            // Recursive case: num! = num * (num - 1)!
            return num * calculateFactorial(num - 1);
        }
    }

    // Check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    // Calculate sum of first n natural numbers
    public static int calculateSumOfN(int n) {
        // formula for sum of first n natural numbers: n * (n + 1) / 2
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Calculate Sum of First N Natural Numbers");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Calculate factorial:");
                    int factorialInput = scanner.nextInt();
                    System.out.println("Factorial: " + calculateFactorial(factorialInput));
                    break;

                case 2:
                    System.out.println("Check palindrome:");
                    int palindromeInput = scanner.nextInt();
                    System.out.println("Is Palindrome: " + isPalindrome(palindromeInput));
                    break;

                case 3:
                    System.out.println("Calculate sum of first N natural numbers:");
                    int sumInput = scanner.nextInt();
                    System.out.println("Sum of First N Natural Numbers: " + calculateSumOfN(sumInput));
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

//Notes for Reference:

//**Initializing** something means defining the new values like int a=100; int b=100; or (declaring)int a, b; (initializing)a = 100; b = 100; and **updating** means reassign the original ref. variable to some other value a=140; b=140;(Same goes for String too)
//
//        **Scoping:** Anything that is initialized outside the block can be used inside the block but anything that is used inside the block cannot be used outside the block (block: { } )
//
//        Suppose, int a =100;
//
//        {
//
//        a=100;
//
//        int b = 100;
//
//        }
//
//        b= 100;(error, can’t use outside the block)
//
//        Similarly, anything that is initialized outside the block cannot be initialized inside the block but anything that is initialized inside the block can be initialized again outside the block
//
//        Anything that you’re using inside the main function you have to make it static
//
//public class Scope{
//
//    static int a;
//
//    psvm(String[] args){
//
//    }}
//
//**Shadowing** in Java occurs when a local variable or a parameter in a certain scope has the same name as a variable in an outer scope, causing the inner variable to "shadow" the outer one within its scope.
//
//public class ShadowingExample {
//    int x = 10; // Outer variable
//
//```
//    public void shadowMethod() {
//        int x = 20; // Inner variable shadows the outer one
//        System.out.println("Inner x: " + x); // Prints the value of the inner variable (20)
//    }
//
//    public static void main(String[] args) {
//        ShadowingExample example = new ShadowingExample();
//        System.out.println("Outer x: " + example.x); // Prints the value of the outer variable (10)
//
//        example.shadowMethod(); // Calls the method with the inner variable
//    }
//
//```
//
//}
//
//    In Java, **variable-length argument lists (varArgs)** allow a method to accept a variable number of arguments of the same type. It is denoted by an ellipsis (...) followed by the argument type in the method parameter list. The varargs parameter must be the last parameter in the method signature.
//
//        Suppose,
//public static void printNames(**String... names**) {
//
//        ```
//public static void main(String[] args) {
//        printNames("Alice", "Bob", "Charlie"); // Call with multiple arguments
//        printNames("David", "Eve"); // Call with a different number of arguments
//        }
//        }
//        In this example, the printNames method can accept a variable number of String arguments. You can call the method with different numbers of names, and it will handle them
//        accordingly. Can also take with multiple datatypes like, public static void printNames
//        (int a; int b; **String... names**)
//        ```
//
//        **Function overloading** in Java refers to the ability to define multiple methods in the same class with the same name but different parameter lists. The compiler distinguishes these methods based on the number, type, or order of their parameters. Overloading allows developers to create more readable and flexible code by providing multiple ways to call a method with different inputs.
//
//        Key points about function overloading in Java:
//
//        1. **Same Method Name:**
//        - Multiple methods in the same class share the same name.
//        2. **Different Parameter Lists:**
//        - Overloaded methods have different types, number, or order of parameters.
//        3. **Return Type is Not Considered:**
//        - Overloaded methods may have the same or different return types; the compiler distinguishes them based on parameters.
//
//        Example:
//
//        ```java
//public class MathOperations {
//    // Method with two int parameters
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    // Method with three double parameters
//    public double add(double a, double b, double c) {
//        return a + b + c;
//    }
//
//    // Method with a different order of int parameters
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // Method with a different type of parameter
//    public String add(String a, String b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        MathOperations math = new MathOperations();
//
//        // Different ways to call the add method based on the parameters
//        System.out.println(math.add(5, 10));
//        System.out.println(math.add(2.5, 3.5, 4.0));
//        System.out.println(math.add(1, 2, 3));
//        System.out.println(math.add("Hello", " World"));
//    }
//}
//
//```
//
//        In this example, the `MathOperations` class has multiple `add` methods with different parameter lists,
//        demonstrating function overloading.
//        The appropriate method is called based on the number and types of arguments provided.
