package com.wyc.d5_static_sigleinstance;

public class Test1 {
    public static void main(String[] args) {
        SingleInstance1 s1 = SingleInstance1.instance;
        SingleInstance1 s2 = SingleInstance1.instance;
        System.out.println(s1);
        System.out.println(s2);
    }
}
