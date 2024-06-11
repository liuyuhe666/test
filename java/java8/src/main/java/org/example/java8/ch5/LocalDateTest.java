package org.example.java8.ch5;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow is " + tomorrow);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Yesterday is " + yesterday);
    }
}
