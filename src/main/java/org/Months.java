package org;

import java.util.List;

public class Months {
    private static final List<String> months = List.of(
            "january",
            "february",
            "march",
            "april",
            "may",
            "june",
            "july",
            "august",
            "september",
            "october",
            "november",
            "december");

    public static List<String> getMonths() {
        return months;
    }
}
