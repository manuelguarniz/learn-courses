package com.futurelabs.datesformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExampleDate {
    public static void main(String[] args) {
        LocalDateTime now  = LocalDateTime.of(2024, 11, 5, 6, 34,23);
        LocalDateTime tomorrow  = LocalDateTime.of(2024, 11, 5, 12, 59,23);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("h a", Locale.US);
        System.out.println(dateFormat.format(now).toUpperCase());
        System.out.println(dateFormat.format(tomorrow).toUpperCase());
    }
}
