package com.wyc.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"王一川", "王二川", "赵敏", "王三川", "王王立大功");
        System.out.println(list);

        list.stream().map(s->"wyc:" + s).forEach(System.out::println);

//        list.stream().map(s -> new Student(s)).forEach(System.out::println);
        list.stream().map(Student::new).forEach(System.out::println);

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("王"));
        Stream<String> s2 = Stream.of("Java1", "Java2");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);
    }
}
