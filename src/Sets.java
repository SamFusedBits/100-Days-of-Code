package src;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

//    Given an array of integers, write a Java program to remove duplicate elements from it.
    public static class RemoveDuplicatesFromArray {
        public static void main(String[] args) {
            int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

            // Convert the array to a set to remove duplicates
            Set<Integer> uniqueNumbers = new HashSet<>();
            for (int num : numbers) {
                uniqueNumbers.add(num);
            }

            System.out.println("Original array: " + Arrays.toString(numbers));
            System.out.println("Array with duplicates removed: " + uniqueNumbers);
        }
    }

/*    Check for Anagrams
    Given two strings, write a Java program to check if they are anagrams of each other.*/
 //To determine if two strings are anagrams of each other, you need to compare whether they contain the same letters. If the two strings contain the same set of letters (with the same frequency), they are considered anagrams.

    public static class AnagramChecker {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            // Convert strings to character arrays
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();

            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();

            // Adding characters from strings to sets
            for (char c : chars1) {
                set1.add(c);
            }
            for (char c : chars2) {
                set2.add(c);
            }

            if (set1.equals(set2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
    }
}
