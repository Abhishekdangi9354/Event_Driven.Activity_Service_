package com.Event_Driven_Activity.Event_Driven_Activity_Services.helper;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String nowAsIso() {
        return DateTimeFormatter.ISO_INSTANT.format(Instant.now());
    }
}
