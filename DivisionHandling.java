package Exception;

import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Please enter the numerator: ");
            double numerator = scanner.nextDouble();

            System.out.print("Please enter the denominator: ");
            double denominator = scanner.nextDouble();

            double result = numerator / denominator;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");
        } finally {
 
            scanner.close();
        }

        // Continue with other operations
        System.out.println("Program continues after handling the exception.");
    }
}
