package org.example.java8.ch2;

import cn.hutool.core.io.file.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParallelSortTest {
    public static void main(String[] args) {
        FileReader reader = new FileReader("data/data.txt");
        List<String> data = new ArrayList<>();
        reader.readLines(data);
        // 并行排序
        long t0 = System.nanoTime();
        long count = data.parallelStream()
                .sorted()
                .count();
        System.out.println(count);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.printf("parallel sort took: %d ms%n", millis);
    }
}
