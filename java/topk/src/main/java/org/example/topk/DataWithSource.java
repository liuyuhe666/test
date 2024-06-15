package org.example.topk;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataWithSource implements Comparable<DataWithSource> {
    // 数值
    private int value;
    // 记录数值来源的数组
    private int source;
    // 记录数值在数组中的索引
    private int index;

    @Override
    public int compareTo(DataWithSource o) {
        return Integer.compare(o.getValue(), this.value);
    }
}
