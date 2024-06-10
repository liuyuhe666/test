package org.example.ds;

import java.util.Arrays;

/**
 * 数组
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        // 数组赋值
        Arrays.fill(arr1, 1);
        Arrays.fill(arr2, 2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // 数组比较
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println(flag);
        // 数组排序
        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 二分查找
        int res = Arrays.binarySearch(arr, 2);
        System.out.println(res);
    }
}
