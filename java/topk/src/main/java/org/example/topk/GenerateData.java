package org.example.topk;

import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.RandomUtil;

import java.util.Arrays;
import java.util.Collections;

/**
 * 生成 20 个数组，每个数组有 500 个元素，并且降序排列
 */
public class GenerateData {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter("data/data.txt");
        for (int i = 0; i < 20; i++) {
            Integer[] arr = new Integer[500];
            for (int j = 0; j < arr.length; j++) {
                // 产生一个 [10, 1000) 的随机数
                int num = RandomUtil.randomInt(10, 1000);
                arr[j] = num;
            }
            // 将数组降序排序
            Arrays.sort(arr, Collections.reverseOrder());
            fileWriter.append(Arrays.toString(arr));
            fileWriter.append("\n");
        }
    }
}
