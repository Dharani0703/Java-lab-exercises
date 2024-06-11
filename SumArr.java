package arrays;

public class SumArr {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int sum = calculateSum(numbers);

        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

