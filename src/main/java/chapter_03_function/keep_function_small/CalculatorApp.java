package chapter_03_function.keep_function_small;

public class CalculatorApp {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;

        int product = multiply(firstNumber, secondNumber);
        int sum = add(firstNumber, secondNumber);
        int difference = subtract(firstNumber, secondNumber);

        int totalResult = calculateTotal(product, sum, difference);

        System.out.println("Final Result: " + totalResult);
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int calculateTotal(int product, int sum, int difference) {
        return product + sum + difference;
    }
}
