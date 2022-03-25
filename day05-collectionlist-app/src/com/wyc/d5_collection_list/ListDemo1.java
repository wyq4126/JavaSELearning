package com.wyc.d5_collection_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");
        System.out.println(list);

        // 添加
        list.add(2, "HTML");
        System.out.println(list);

        // 删除
        System.out.println(list.remove(2));
        System.out.println(list);

        // 根据索引取元素
        System.out.println(list.get(2));

        // 根据索引改元素内容，返回修改前的数据
        System.out.println(list.set(1, "python"));
        System.out.println(list);
    }
}
