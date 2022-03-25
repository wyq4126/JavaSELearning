package com.wyc.d7_genericity;

public class GenericityClass {
    public static void main(String[] args) {
        // 模拟ArrayList的MyArrayList泛型类
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("MySQL");
        list.remove("Java");
        System.out.println(list);

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(22);
        list1.add(78);
        list1.add(78);
        list1.remove(78);
    }
}
