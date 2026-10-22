package quiz2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumOfTwoPositiveNumbers() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void sumOfTwoNegativeNumbers() {
        assertEquals(-5, calculator.sum(-2, -3));
    }

    @Test
    void sumWithZero() {
        assertEquals(7, calculator.sum(7, 0));
    }
}
