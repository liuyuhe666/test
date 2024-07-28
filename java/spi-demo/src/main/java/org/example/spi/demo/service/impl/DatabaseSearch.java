package org.example.spi.demo.service.impl;

import org.example.spi.demo.service.Search;

import java.util.Collections;
import java.util.List;

public class DatabaseSearch implements Search {
    @Override
    public List<String> search(String text) {
        System.out.println("数据库搜索: " + text);
        return Collections.emptyList();
    }
}
