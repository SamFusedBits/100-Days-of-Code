package src;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Fibonacci Series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        // 2. Reverse a String
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.next();
        System.out.print("Reversed String: ");
        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }
        System.out.println();

        // 3. Check Leap Year
        boolean validYear = false;
        while (!validYear) {
            System.out.print("Enter a year to check leap year: ");
            int year = scanner.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
                validYear = true;
            } else {
                System.out.println("Not a valid leap year. Try again.");
            }
        }

        // 4. Create a loop to calculate and display the sum of digits of a given number.
        System.out.print("Enter a number to calculate the sum of its digits: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of Digits: " + sum);

        // 5. Write a loop to count and print the number of days you can go out with his friends in the month of August. Consider that he is only allowed to go out on even days.
        int daysAllowed = 0;
        for (int day = 1; day <= 31; day++) {
            if (day % 2 == 0) {
                daysAllowed++;
            }
        }
        System.out.println("You can go out on " + daysAllowed + " even days in August.");

        // 6. Use a loop to take integer inputs from the user until they enter 0. Print the sum of all the entered numbers.
        int totalSum = 0;
        int input;
        do {
            System.out.print("Enter a number (0 to terminate): ");
            input = scanner.nextInt();
            totalSum += input;
        } while (input != 0);
        System.out.println("Sum of Entered Numbers: " + totalSum);

        scanner.close();


        //Resources: https://www.youtube.com/watch?v=ldYLYRNaucM
    }
}
