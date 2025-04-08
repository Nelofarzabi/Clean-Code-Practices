package chapter_09_unit_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void add_twoNumbers_shouldReturnSum() {
        int firstNumber = 2;
        int secondNumber = 3;

        int result = calculator.add(firstNumber, secondNumber);

        assertEquals(5, result, "The sum of 2 and 3 should be 5");
    }

    @Test
    public void subtract_twoNumbers_shouldReturnDifference() {
        int firstNumber = 5;
        int secondNumber = 3;

        int result = calculator.subtract(firstNumber, secondNumber);

        assertEquals(2, result, "5 - 3 should be 2");
    }

    @Test
    public void multiply_twoNumbers_shouldReturnProduct() {
        int firstNumber = 4;
        int secondNumber = 3;

        int result = calculator.multiply(firstNumber, secondNumber);

        assertEquals(12, result, "4 * 3 should be 12");
    }

    @Test
    public void divide_twoNumbers_shouldReturnQuotient() {
        int firstNumber = 6;
        int secondNumber = 2;

        int result = calculator.divide(firstNumber, secondNumber);

        assertEquals(3, result, "6 / 2 should be 3");
    }

    @Test
    public void divide_byZero_shouldThrowException() {
        int firstNumber = 5;
        int secondNumber = 0;

        assertThrows(ArithmeticException.class, () -> calculator.divide(firstNumber, secondNumber), "Division by zero should throw ArithmeticException");
    }
}
