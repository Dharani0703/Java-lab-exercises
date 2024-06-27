package collections;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotato {
    public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> players = new LinkedList<>();

        // Enqueue player names
        players.add("Alice");
        players.add("Bob");
        players.add("Charlie");
        players.add("David");
        players.add("Eve");

        // Number of times to pass the potato before removing a player
        int passes = 3;

        // Simulate the game until only one player remains
        while (players.size() > 1) {
            // Pass the potato (dequeue and enqueue)
            for (int i = 0; i < passes; i++) {
                String player = players.remove();
                players.add(player);
            }

            // Remove the player holding the potato when the music stops
            String removedPlayer = players.remove();
            System.out.println(removedPlayer + " is out.");
        }

        // The remaining player is the winner
        String winner = players.peek();
        System.out.println("The winner is " + winner + "!");
    }
}

