package quiz2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class DateCheckerTest {

    private final DateChecker checker = new DateChecker();

    @Test
    void januaryHas31Days() {
        assertTrue(checker.has31Days(Month.JANUARY), "January has 31 days");
    }

    @Test
    void aprilDoesNotHave31Days() {
        assertFalse(checker.has31Days(Month.APRIL), " April has 30 days, not 31");
    }

    @ParameterizedTest(name = "{0} has 31 days")
    @EnumSource(value = Month.class, names = { "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" })
    void monthsWith31Days(Month month) {
        assertTrue(checker.has31Days(month), month + " should have 31 days");
    }

    @ParameterizedTest(name = "{0} does not have 31 days")
    @EnumSource(value = Month.class, names = { "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" })
    void monthsWith30Days(Month month) {
        assertFalse(checker.has31Days(month), month + " has 30 days, not 31");
    }
}
