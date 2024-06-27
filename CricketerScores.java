package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Store some cricketer names and their scores
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Virat Kohli", 12040);
        cricketerScores.put("Ricky Ponting", 13704);
        cricketerScores.put("Brian Lara", 10405);
        cricketerScores.put("Jacques Kallis", 11579);

        // Display the cricketer scores
        System.out.println("Cricketer Scores: " + cricketerScores);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the cricketer
        System.out.print("Enter the name of the cricketer to search for: ");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer and display his score
        if (cricketerScores.containsKey(cricketerName)) {
            int score = cricketerScores.get(cricketerName);
            System.out.println("The score of " + cricketerName + " is: " + score);
        } else {
            System.out.println(cricketerName + " is not found in the list.");
        }

        // Close the scanner
        scanner.close();
    }
}
