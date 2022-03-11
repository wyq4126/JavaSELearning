package com.wyc.d5_static_sigleinstance;

public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getSingleInstance2();
        SingleInstance2 s2 = SingleInstance2.getSingleInstance2();
        SingleInstance2 s3 = SingleInstance2.getSingleInstance2();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
