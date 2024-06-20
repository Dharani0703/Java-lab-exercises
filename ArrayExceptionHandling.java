package Exception;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        // Initialize an array with some elements
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Attempt to access an element at an index that is out of bounds
            int outOfBoundsElement = numbers[10];
            System.out.println("Element at index 10: " + outOfBoundsElement);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print an error message
            System.out.println("Error: Attempted to access an index that is out of bounds.");
            System.out.println("Exception message: " + e.getMessage());
        }

        // Continue with other operations
        System.out.println("Program continues after handling the exception.");
    }
}
