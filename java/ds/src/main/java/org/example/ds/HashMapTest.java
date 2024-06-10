package org.example.ds;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        // 添加元素
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
        // 访问元素
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(5, "five"));
        // 删除元素
        System.out.println(map.remove(2));
        System.out.println(map);
        // 遍历
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
