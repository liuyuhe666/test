package org.example.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 添加元素
        List<String> strList = new ArrayList<>();
        strList.add("s1");
        strList.add("s2");
        strList.add("s3");
        // 访问元素
        System.out.println(strList.get(1)); // 第二个元素
        System.out.println(strList.get(2)); // 第三个元素
        // 修改元素
        strList.set(2, "ss3");
        System.out.println(strList.get(2));
        // 删除元素
        strList.remove(0);
        System.out.println(strList);
        // 遍历
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        for (String str : strList) {
            System.out.println(str);
        }
        // 排序
        ArrayList<String> sites = new ArrayList<>();
        sites.add("taobao");
        sites.add("wiki");
        sites.add("runoob");
        sites.add("weibo");
        sites.add("google");
        Collections.sort(sites);  // 字母排序
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
