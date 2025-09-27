package TestCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void successAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addTwoNumbers(5, 5);
        assertEquals(10, result);
    }
}