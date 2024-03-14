package src;

public class Arrays {
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
        public static void main(String[] args) {
            int[] numbers = {10, 20, 5, 30, 15};
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Maximum element: " + max);
        }
    }
