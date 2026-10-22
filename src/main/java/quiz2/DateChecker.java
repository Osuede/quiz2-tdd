package quiz2;

public class DateChecker {

    public boolean has31Days(Month month) {
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> true;
            default -> false;
        };
    }
}
