package src;

public class Errors {

    /* OutofMemory Error - This error occurs when the Java Virtual Machine (JVM) cannot allocate enough memory
     to create new objects. It usually happens when the heap space is exhausted due to excessive memory
     allocation, such as creating large arrays or objects. */

//    public static void main(String[] args) {
//        try {
//            int[] array = new int[Integer.MAX_VALUE]; // Attempt to allocate a large array
//        } catch (OutOfMemoryError e) {
//            System.err.println("This represents Out of memory error: " + e.getMessage());
//        }
//    }

     /* StackOverflowError - This error occurs when the stack memory allocated for method calls
        exceeds its limit. It typically happens with recursive methods that call themselves indefinitely
        without reaching a base case to terminate the recursion. */

    public static void main(String[] args) {
        try {
            recursiveMethod(0); // Start the recursive method
        } catch (StackOverflowError e) {
            System.err.println("Stack overflow error: " + e.getMessage());
        }
    }

    private static void recursiveMethod(int num) {
        System.out.println("Number: " + num);
        recursiveMethod(num + 1); // Recursive call
    }


     /* NoClassDefFoundError - This error occurs when the JVM tries to load a class at runtime
     but cannot find the definition of the class. It usually happens when the class existed
     during compilation but is missing at runtime, often due to a missing JAR file
     or incorrect classpath settings. */

//        public static void main(String[] args) {
//            try {
//                // Attempt to instantiate a class that does not exist
//                NonExistentClass obj = new NonExistentClass();
//            } catch (NoClassDefFoundError e) {
//                System.err.println("No class definition found error: " + e.getMessage());
//            }
//        }
    }

