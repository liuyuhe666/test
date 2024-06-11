package org.example.java8.ch5;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);
        Instant instant = clock.instant();
        System.out.println(instant);
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);
    }
}
