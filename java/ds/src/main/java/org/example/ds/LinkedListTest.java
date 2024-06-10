package org.example.ds;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // 创建链表
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        // 开头添加元素
        list.addFirst("e");
        System.out.println(list);
        // 开头删除元素
        list.removeFirst();
        System.out.println(list);
        // 获取开头元素
        String val = list.getFirst();
        System.out.println(val);
        // 结尾添加元素
        list.addLast("f");
        System.out.println(list);
        // 结尾删除元素
        list.removeFirst();
        System.out.println(list);
        // 获取结尾元素
        val = list.getLast();
        System.out.println(val);
    }
}
