package org.example.ds;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        // 添加元素
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("Y");
        treeSet.add("X");
        System.out.println(treeSet);
        // 查询元素
        String first = treeSet.first();
        System.out.println(first);
        String last = treeSet.last();
        System.out.println(last);
        // 删除元素
        treeSet.remove("X");
        System.out.println(treeSet);
        // 判断是否存在某个元素
        boolean res = treeSet.contains("X");
        System.out.println(res);
        res = treeSet.contains("A");
        System.out.println(res);
    }
}
