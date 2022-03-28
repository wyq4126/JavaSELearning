package com.wyc.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 集合
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valuesStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> keyAndValueStream = map.entrySet().stream();

        // 数组
        String[] names = {"王一川", "王二川", "赵敏"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
