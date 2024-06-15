package org.example.topk;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKTest {
    public static void main(String[] args) {
        FileReader reader = new FileReader("data/data.txt");
        ArrayList<String> lines = new ArrayList<>();
        reader.readLines(lines);
        int[][] data = new int[20][500];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String s = StrUtil.sub(line, 1, line.length() - 1);
            String[] strings = s.split(", ");
            for (int j = 0; j < strings.length; j++) {
                data[i][j] = Integer.parseInt(strings[j]);
            }
        }
        int[] res = getTopK(data);
        System.out.println("Size: " + res.length);
        System.out.println("TopK: " + Arrays.toString(res));
    }

    public static int[] getTopK(int[][] data) {
        int row = data.length;
        int col = data[0].length;
        // 结果数组
        int[] result = new int[col];
        PriorityQueue<DataWithSource> heap = new PriorityQueue<>();
        for (int i = 0; i < row; i++) {
            // 将每个数组中的最大值放入堆中
            DataWithSource d = new DataWithSource(data[i][0], i, 0);
            heap.add(d);
        }

        int i = 0;
        while (true) {
            // 删除堆顶的元素
            DataWithSource d = heap.poll();
            assert d != null;
            result[i++] = d.getValue();
            if (i >= col) {
                break;
            }
            d.setValue(data[d.getSource()][d.getIndex() + 1]);
            d.setIndex(d.getIndex() + 1);
            heap.add(d);
        }
        return result;
    }
}
