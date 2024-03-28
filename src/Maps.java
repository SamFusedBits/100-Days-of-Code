package src;
import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static class Main {
        public static void main(String[] args) {
            // Creating a HashMap
            Map<String, Integer> scores = new HashMap<>();

            // Adding key-value pairs
            scores.put("Sahil", 95);
            scores.put("John", 85);
            scores.put("Charlie", 90);

            // Accessing values by keys
            System.out.println("John's score: " + scores.get("John"));

            // Iterating over keys
            for (String name : scores.keySet()) {
                System.out.println(name + "'s score: " + scores.get(name));
            }

            if (scores.containsKey("Sahil")) {
                System.out.println("Sahil's score exists.");
            }

            scores.remove("Charlie");

            // Size of the map
            System.out.println("Number of entries: " + scores.size());
        }
    }

        /* Q2. Write a Java program to count the frequency of each integer in the array and store the results in a map.
        The keys of the map should be the unique integers present in the array, and the values should be
        the frequency of each integer.
        */
        public static class FrequencyCounter {
            public static void main(String[] args) {
                int[] numbers = {1, 2, 3, 4, 2, 3, 1, 2, 4, 5, 2, 3, 3};

                Map<Integer, Integer> frequencyMap = new HashMap<>();

                // Count the frequency of each integer in the array
                for (int num : numbers) {
                    if (frequencyMap.containsKey(num)) {
                        frequencyMap.put(num, frequencyMap.get(num) + 1); //If the integer is already present in the map (frequencyMap.containsKey(num)), we increment its frequency by 1.
                    } else {
                        frequencyMap.put(num, 1); //If the integer is not present in the map, we add it to the map with a frequency of 1.
                    }
                }

                System.out.println("Frequency of each integer:");
                for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }
/*    In Java, the Map interface is designed as an abstraction that represents a collection of key-value
 pairs. However, it's important to note that the Map interface itself cannot be instantiated
 because it's an interface, not a concrete class. Therefore, you cannot directly create an instance of Map
  using the new keyword.

  To create a Map instance, you need to choose one of the concrete implementations provided by the Java
  Collections Framework, such as HashMap, TreeMap, LinkedHashMap, or ConcurrentHashMap.*/
