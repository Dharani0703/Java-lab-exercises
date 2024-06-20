package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        Operation addition = new addition();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation division = new Division();
        
        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + calculator.performOperation(addition, num1, num2));
        System.out.println("Subtraction: " + calculator.performOperation(subtraction, num1, num2));
        System.out.println("Multiplication: " + calculator.performOperation(multiplication, num1, num2));
        System.out.println("Division: " + calculator.performOperation(division, num1, num2));
    }
}

