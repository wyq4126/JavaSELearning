package com.wyc.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("HTML");
        list.add("MySQL");
        System.out.println(list);

        // 清空
//        list.clear();
//        System.out.println(list);

        // 判断为空
        System.out.println(list.isEmpty());

        // 集合大小
        System.out.println(list.size());

        // 判断包含元素【精准包含
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("va"));

        // 删除元素（内容删，只删第一个
        list.remove("java");
        System.out.println(list);
        list.remove("Java");
        System.out.println(list);

        // 集合 -> 数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("==========merge=============");
        Collection<String> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();

        list1.add("python");
        list1.add("math");
        list2.add("test");
        list2.add("happy");

        list1.addAll(list2);
        System.out.println(list1);
    }
}
