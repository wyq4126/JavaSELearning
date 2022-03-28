package com.wyc.d5_map;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("banana", 20);
        maps.put("apples", 10);
        maps.put("apples", 50);  //覆盖前面的apple数据
        maps.put("Java", 20);
        System.out.println(maps);

//        maps.clear();
//        System.out.println(maps);
//
//        System.out.println(maps.isEmpty());

        // 重要
        Integer key = maps.get("banana");
        System.out.println(key);
        System.out.println(maps.get("Java"));

        // 删除
        System.out.println(maps.remove("Java"));
        System.out.println(maps);

        // 包含某个键
        System.out.println(maps.containsKey("Java"));
        System.out.println(maps.containsKey("apples"));

        // 包含某个值
        System.out.println(maps.containsValue(20));
        System.out.println(maps.containsValue(50));

        // 获取全部键的集合 Set<K> keySet()
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        // 获取全部值的集合 Collection<V> values()
        Collection<Integer> values = maps.values();
        System.out.println(values);

        // 集合大小
        System.out.println(maps.size());

        // 合并其他集合
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java1", 1);
        map1.put("Java2", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map1.put("Java2", 20);
        map1.put("Java3", 100);

        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
