package collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "This is a sample text. This text is for testing. This is a test text.";

        // Call the method to count word occurrences
        Map<String, Integer> wordCount = countWordOccurrences(text);

        // Display the word counts
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordOccurrences(String text) {
        // Remove punctuation and convert to lowercase
        text = text.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }
}

