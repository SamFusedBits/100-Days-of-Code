package src;
import java.util.Scanner;

public class Arrays {

//                                Day 1 or Arrays
//    An array is a data structure that stores a collection of elements of the same type in contiguous memory locations.
//    Arrays provide efficient random access to elements based on their index.
//
//    Declaration and Initialization:
//    int[] numbers; // Declarationnumbers = new int[5]; // Initialization with size 5
//    Accessing Elements:
//    int[] numbers = {1, 2, 3, 4, 5};int firstElement = numbers[0]; // Accessing the first element
//
//    Array Length:
//    int[] numbers = {1, 2, 3, 4, 5};int arrayLength = numbers.length; // Length of the array
//    Iterating Through an Array:
//
//    Iterating Through an Array:
//    Arrays can be traversed using loops like for or foreach.
//    int[] numbers = {1, 2, 3, 4, 5};
//    for (int i = 0; i < numbers.length; i++) {
//    System.out.println(numbers[i]);
//    }


//    Q. Find the maximum element in an integer array.
//        public static void main(String[] args) {
//            int[] numbers = {10, 20, 5, 30, 15};
//            int max = numbers[0];
//            for (int i = 1; i < numbers.length; i++) {
//                if (numbers[i] > max) {
//                    max = numbers[i];
//                }
//            }
//            System.out.println("Maximum element: " + max);
//        }
//    }


//                               Day 2 of Arrays

//        Program that calculates the sum and average of elements in an array.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Creating an array of size n
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sc.close();

        // Calculating sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num; // Adding each number to the sum
        }
        double average = (double) sum / n; // Calculating average

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
    }
}

//Sure, let's delve into explanations and examples for topics 2, 3, and 7:
//
//        ### Array Operations:
//
//        Arrays in Java support various operations, including:
//
//        - Accessing elements: You can access individual elements in an array using their indices (positions).
//        - Modifying elements: You can change the value of elements in an array by assigning new values to them.
//        - Iterating through elements: You can traverse all elements of an array using loops like `for` loop, `enhanced for` loop, or `while` loop.
//
//
//// Accessing elements in an array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println("Element at index 2: " + numbers[2]); // Output: 3
//
//// Modifying elements in an array
//        numbers[3] = 10;
//        System.out.println("Modified array: " + Arrays.toString(numbers)); // Output: [1, 2, 3, 10, 5]
//
//// Iterating through elements in an array using for loop
//        for (int i = 0; i < numbers.length; i++) {
//        System.out.println("Element at index " + i + ": " + numbers[i]);
//        }
//
//        ### Array Initialization:
//
//        In Java, arrays can be initialized in several ways:
//
//        - **Static initialization:** You can initialize an array with predefined values at the time of declaration.
//        - **Dynamic initialization:** You can initialize an array with values computed at runtime.
//        - **Array literals:** Introduced in Java 5, this allows you to directly specify the array elements without using the `new` keyword.
//
//// Static initialization
//        int[] staticArray = {1, 2, 3, 4, 5};
//
//// Dynamic initialization
//        int[] dynamicArray = new int[5];
//        for (int i = 0; i < dynamicArray.length; i++) {
//        dynamicArray[i] = i * 2;
//        }
//
//// Array literals (Java 5+)
//        int[] literalArray = new int[]{1, 3, 5, 7, 9}; // No need to specify the size explicitly
//
//
//        ### Arrays vs. ArrayLists:
//
//        Arrays and ArrayLists are both used to store collections of elements, but they have differences:
//
//        - **Arrays:** Fixed-size collections with a predefined length. They offer direct access to elements using indices and are more memory-efficient.
//        - **ArrayLists:** Dynamic-size collections that can grow or shrink dynamically. They offer more flexibility in terms of adding, removing, and manipulating elements but may consume more memory due to overhead.
//
//// Array
//        int[] numbersArray = {1, 2, 3, 4, 5};
//        System.out.println("Array length: " + numbersArray.length);
//
//// ArrayList
//        ArrayList<Integer> numbersList = new ArrayList<>();
//        numbersList.add(1);
//        numbersList.add(2);
//        numbersList.add(3);
//        System.out.println("ArrayList size: " + numbersList.size());


