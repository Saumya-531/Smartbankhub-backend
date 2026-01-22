package com.smartbankhub.util;

import java.time.LocalDate;

public class DateRangeUtil {

    public static LocalDate today() {
        return LocalDate.now();
    }

    public static LocalDate weekStart() {
        return LocalDate.now().minusDays(7);
    }

    public static LocalDate monthStart() {
        return LocalDate.now().withDayOfMonth(1);
    }
}
