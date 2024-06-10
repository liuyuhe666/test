package org.example.ds;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        // 创建优先队列
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 添加元素
        pq.add(4);
        pq.add(2);
        pq.add(1);
        System.out.println(pq);
        // 使用 peek() 方法
        int num = pq.peek();
        System.out.println(num);
        // 删除元素
        num = pq.poll();
        System.out.println(num);
        System.out.println(pq);
    }
}
