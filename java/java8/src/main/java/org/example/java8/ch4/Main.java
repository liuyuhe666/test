package org.example.java8.ch4;

public class Main {
    public static void main(String[] args) {
        Formula f = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(f.calculate(100));
        System.out.println(f.sqrt(16));
    }
}
