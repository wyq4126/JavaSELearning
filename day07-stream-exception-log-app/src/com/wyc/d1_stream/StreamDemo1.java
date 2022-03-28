package com.wyc.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"王一川", "王二川", "赵敏", "王三川", "王王立大功");
        System.out.println(list);

//        List<String> wangList = new ArrayList<>();
//        for (String s : list) {
//            if(s.startsWith("王")) {
//                wangList.add(s);
//            }
//        }
//        System.out.println(wangList);
//
//        List<String> wang3List = new ArrayList<>();
//        for (String s : wangList) {
//            if(s.length() == 3) {
//                wang3List.add(s);
//            }
//        }
//        System.out.println(wang3List);

        list.stream().filter(s -> s.startsWith("王")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
