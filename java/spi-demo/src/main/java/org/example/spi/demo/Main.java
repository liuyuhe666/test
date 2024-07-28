package org.example.spi.demo;

import org.example.spi.demo.service.Search;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);
        for (Search search : serviceLoader) {
            search.search("Hello, World!");
        }
    }
}
