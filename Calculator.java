package calculator;

class Calculator {
    public double performOperation(Operation operation, double a, double b) {
        return operation.calculate(a, b);
    }
}