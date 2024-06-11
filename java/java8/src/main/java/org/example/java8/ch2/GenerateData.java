package org.example.java8.ch2;

import cn.hutool.core.io.file.FileWriter;

import java.util.UUID;

public class GenerateData {
    public static void main(String[] args) {
        FileWriter fw = new FileWriter("data/data.txt");
        int n = 1000000;
        for (int i = 0; i < n; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
            fw.append(uuid+ "\r\n");
        }
    }
}
