package com.wyc.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("HTML");
        list.add("MySQL");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            // next先取元素后移位
            String element = it.next();
            System.out.println(element);
        }

        System.out.println("-----------------");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
