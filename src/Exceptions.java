package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exceptions {

//    In Java, an exception is an event that occurs during the execution of a program, which disrupts the normal flow of the program's instructions.

//    Basic Exception Handling Keywords:
//            try: The try block encloses the code that might throw an exception.
//            catch: The catch block handles the exception thrown by the try block.
//            finally: The finally block contains code that will always execute, regardless of whether an exception is thrown or not.
//            throw: The throw keyword is used to explicitly throw an exception.

//    Checked Exceptions:
//            public static void main(String[] args) {
//            try {
//                FileReader fileReader = new FileReader("file.txt");
//            } catch (IOException e) {
//                System.out.println("Error reading file: " + e.getMessage());
//            }
//        }
//    }

//    Definition: Checked exceptions are exceptions that the Java compiler forces you to handle explicitly. They represent exceptional conditions that a well-behaved application should anticipate and recover from.
//
//    Key Points:
//    Compile-Time Checking: Checked exceptions are checked by the compiler during compilation. If a method throws a checked exception, the calling method must either catch the exception using a try-catch block or declare the exception to be thrown (propagate it up the call stack).
//    Examples: IOException, SQLException, ClassNotFoundException, etc.
//    Use Case: Checked exceptions are typically used for conditions that are outside the control of the program, such as I/O errors, database connectivity issues, and file handling problems.


//    Unchecked Exceptions:
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        try {
//            System.out.println(numbers[5]); // Accessing an index outside the array bounds
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error: Array index out of bounds");
//        }
//    }
//}

//    Definition: Unchecked exceptions, also known as runtime exceptions, are exceptions that do not need to be explicitly handled at compile time. They represent conditions that generally reflect errors in the program's logic or runtime environment.
//
//    Key Points:
//    Runtime Checking: Unchecked exceptions are not checked by the compiler at compile time. They occur at runtime, and the compiler does not force you to handle them.
//            Examples: NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException, etc.
//    Use Case: Unchecked exceptions usually indicate programming errors, such as accessing null references, attempting to access an array element outside its bounds, or passing invalid arguments to a method.


//          Example:
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two numbers to divide:");
            try {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int result = divide(num1, num2);
                System.out.println("Result of division: " + result);
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid integers for division.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

            scanner.close();
        }

        private static int divide(int num1, int num2) {
            return num1 / num2;
        }
    }