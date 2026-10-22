package quiz2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // sum

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

    // subtract

    @Test
    void subtractSmallerFromLarger() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void subtractLargerFromSmallerGivesNegative() {
        assertEquals(-6, calculator.subtract(4, 10));
    }

    // multiply

    @Test
    void multiplyTwoPositiveNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void multiplyByZeroGivesZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void multiplyNegativeByPositiveGivesNegative() {
        assertEquals(-12, calculator.multiply(-3, 4));
    }

    // divide

    @Test
    void divideEvenly() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void divideDropsTheRemainder() {
        assertEquals(3, calculator.divide(7, 2));
    }

    @Test
    void divideNegativeRoundsTowardZero() {
        assertEquals(-3, calculator.divide(-7, 2));
    }

    @Test
    void divideByZeroThrowsIllegalArgumentException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    // isEven

    @Test
    void positiveEvenNumberIsEven() {
        assertTrue(calculator.isEven(4), "4 should be even");
    }

    @Test
    void zeroIsEven() {
        assertTrue(calculator.isEven(0), "0 should be even");
    }

    @Test
    void negativeEvenNumberIsEven() {
        assertTrue(calculator.isEven(-4), "-4 should be even");
    }

    @Test
    void positiveOddNumberIsNotEven() {
        assertFalse(calculator.isEven(7), "7 should not be even");
    }

    @Test
    void negativeOddNumberIsNotEven() {
        assertFalse(calculator.isEven(-3), "-3 should not be even");
    }
}
