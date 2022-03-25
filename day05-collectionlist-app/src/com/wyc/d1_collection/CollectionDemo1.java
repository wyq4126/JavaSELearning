package com.wyc.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        System.out.println(list);

        // 无序 不重复 无索引
        Collection<Integer> list1 = new HashSet<>();
        list1.add(12);
        System.out.println(list1);
    }
}
