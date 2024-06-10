package org.example.ds;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        // 添加元素
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        // 判断元素是否存在
        System.out.println(set.contains(1));
        System.out.println(set.contains(6));
        // 删除元素
        set.remove(2);
        System.out.println(set);
        // 遍历
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
