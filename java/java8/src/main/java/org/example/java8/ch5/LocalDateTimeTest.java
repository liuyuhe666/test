package org.example.java8.ch5;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(1989, Month.JUNE, 4, 12, 59, 59);
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getLong(ChronoField.MINUTE_OF_DAY));
    }
}
