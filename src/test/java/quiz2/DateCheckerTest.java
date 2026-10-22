package quiz2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DateCheckerTest {

    private final DateChecker checker = new DateChecker();

    @Test
    void januaryHas31Days() {
        assertTrue(checker.has31Days(Month.JANUARY), "January has 31 days");
    }
}
