package org.example.java8.ch1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Sam", "Peter");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        names.sort((a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
