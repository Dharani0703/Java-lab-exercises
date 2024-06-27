package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Store a few elements in the HashMap
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("David", 40);

        // Display the elements of the HashMap
        System.out.println("Initial HashMap: " + map);

        // Associate specified values with specified keys
        map.put("Eve", 28); // Adding a new key-value pair
        map.put("Alice", 32); // Updating the value associated with the key "Alice"

        // Display the elements of the HashMap after the association
        System.out.println("Updated HashMap: " + map);

        // Check if a key exists and get its value
        String key = "Bob";
        if (map.containsKey(key)) {
            System.out.println("The value associated with the key \"" + key + "\" is: " + map.get(key));
        } else {
            System.out.println("The key \"" + key + "\" is not present in the HashMap.");
        }
    }
}
