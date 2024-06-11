package org.example.java8.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamApiTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("f");
        stringList.add("d");
        // Filter
        stringList.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        // Sort
        stringList.stream()
                .sorted()
                .forEach(System.out::println);
        // Map
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        // Match
        boolean anyStartsWithA = stringList.stream()
                .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);
        // Count
        long startsWithB = stringList.stream()
                .filter(s -> s.startsWith("b"))
                .count();
        System.out.println(startsWithB);
        // Reduce
        Optional<String> reduced = stringList.stream()
                .sorted()
                .reduce((s1, s2) -> s1.toUpperCase() + "-" + s2.toUpperCase());
        reduced.ifPresent(System.out::println);
    }
}
