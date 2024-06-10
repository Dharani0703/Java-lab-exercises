package extrapackage;

public class LargestNumber {
    
    public static int findLargest(int num1, int num2, int num3) {
        int largest;
        
        if(num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if(num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        return largest;
    }

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 42;
        int number3 = 17;
        
        int largestNumber = findLargest(number1, number2, number3);
        
        System.out.println("The largest number is: " + largestNumber);
    }
}