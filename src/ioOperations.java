package src;

import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ioOperations {
    // Input and Output (I/O Operations) - Scanner and BufferReader

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter your name: ");
//            String name = scanner.nextLine(); // Read a line of text
//
//
//            System.out.print("Enter your age: ");
//            int age = scanner.nextInt();
//
//            System.out.println("Hello, " + name + "! You are " + age + " years old. Happy Coding!");
//
//            scanner.close();
//        }
//    }

    public static void main(String[] args) {
        String filePath = "infinity.txt"; //Here we'll define the file path

        try {
            // Create a BufferedReader object to read from the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read each line from the file and print it
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}

//    Scanner is easier to use for parsing different types of input,
//    while BufferedReader is more efficient for reading large amounts of text from files or streams.


