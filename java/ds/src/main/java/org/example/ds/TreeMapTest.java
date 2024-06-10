package org.example.ds;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        // 添加元素
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map);
        // 获取元素
        int val = map.get("a");
        System.out.println(val);
        val = map.getOrDefault("d", 4);
        System.out.println(val);
        // 删除元素
        val = map.remove("a");
        System.out.println(val);
    }
}
