package com.wyc.d6_map_api;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapApiDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apples", 10);
        map.put("banana", 20);
        map.put("apples", 50);  //覆盖前面的apple数据
        map.put("Java", 20);
        System.out.println(map);
    }
}
