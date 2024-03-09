package src;

import java.util.Scanner;

public class conditionalsAndLoop {
    public static void main(String[] args) {

//          Volume Of Cone Java Program
//            double pie, volume, radius, height;
//
//            pie = 3.14;
//            Scanner sc = new Scanner((System.in));
//            System.out.println("Enter the radius (r): ");
//            radius = sc.nextDouble();
//            System.out.println("Enter the height (h): ");
//            height = sc.nextDouble();
//
//            volume = (pie*(radius*radius)*(height / 3));
//            System.out.println(volume);


//        Question: "Grade Calculator"
//
//        Write a Java program that takes the marks of a student as input and
//        calculates the grade based on the following criteria:
//
//        If the marks are greater than or equal to 90, the grade is "A."
//        If the marks are between 80 (inclusive) and 90 (exclusive), the grade is "B."
//        If the marks are between 70 (inclusive) and 80 (exclusive), the grade is "C."
//        If the marks are between 60 (inclusive) and 70 (exclusive), the grade is "D."
//        If the marks are less than 60, the grade is "F."
//        Additionally, implement a loop that allows the user to input marks for multiple students
//        until they choose to exit. After each input, display the calculated grade.
//
//                Here are some additional requirements:
//
//        Use a loop to continuously prompt the user for input until they choose to exit.
//        Display a meaningful message for each grade.
//        Implement error handling to ensure that the user enters valid marks (between 0 and 100).
//                Allow the user to enter "exit" to terminate the program.

        Scanner sc = new Scanner(System.in);
        int comp_sci, information_tech, ai, robotics, total_marks;

        while (true) {
            System.out.println("Enter the student's name (type 'exit' to end): ");
            String stud_name = sc.next().toLowerCase(); // Convert to lowercase for case-insensitivity
            if (stud_name.equals("exit")) {
                System.out.println("Thank you for using our grade calculator!");
                break;
            }

            System.out.println("Enter marks in the following subjects (out of 25): ");
            System.out.print("Computer Science: ");
            comp_sci = sc.nextInt();
            System.out.print("Information Technology: ");
            information_tech = sc.nextInt();
            System.out.print("Artificial Intelligence: ");
            ai = sc.nextInt();
            System.out.print("Robotics: ");
            robotics = sc.nextInt();

            // Check if marks are in the valid range (0-25)
            if (comp_sci >= 0 && comp_sci <= 25 && information_tech >= 0 && information_tech <= 25 &&
                    ai >= 0 && ai <= 25 && robotics >= 0 && robotics <= 25) {

                total_marks = comp_sci + information_tech + ai + robotics;

                System.out.println("Total marks for " + stud_name + ": " + total_marks);

                if (total_marks >= 90 && total_marks <= 100) {
                    System.out.println("Grade: A");
                } else if (total_marks >= 80 && total_marks < 90) {
                    System.out.println("Grade: B");
                } else if (total_marks >= 70 && total_marks < 80) {
                    System.out.println("Grade: C");
                } else if (total_marks >= 60 && total_marks < 70) {
                    System.out.println("Grade: D");
                } else if (total_marks < 60) {
                    System.out.println("Grade: F");
                }
                } else {
                System.out.println("Invalid marks. Please enter numeric values!");
            }
        }
    }
}
