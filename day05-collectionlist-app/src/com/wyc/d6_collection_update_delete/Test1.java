package com.wyc.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList并发删除出现的问题，以及解决方案
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");
        list.add("watch");
        list.add("fox");
        System.out.println(list);

//        // Iterator【可用
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String ele = it.next();
//            if("Java".equals(ele)) {
////                list.remove("Java");
//                it.remove(); //删除当前所在元素，并且不会后移
//            }
//        }
//        System.out.println(list);

        // foreach【不可用，报错
//        for (String s : list) {
//            if("Java".equals(s)) {
////               list.remove("Java");
//            }
//        }

        // for循环（无异常，但是会出问题
        for (int i = list.size() - 1; i >= 0; i--) {
            String ele = list.get(i);
            if("Java".equals(ele)) {
                list.remove("Java");
            }
        }
        System.out.println(list);
    }
}
