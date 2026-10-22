package quiz2;

public class DateChecker {

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("month must not be null");
        }
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> true;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> false;
            case FEBRUARY -> false; // 28 or 29 days, never 31, so leap years don't matter
        };
    }
}
