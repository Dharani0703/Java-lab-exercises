package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter an integer: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {

            System.out.println("Error: You must enter an integer value.");
        } finally {

            scanner.close();
        }


        System.out.println("Program continues after handling the exception.");
    }
}
