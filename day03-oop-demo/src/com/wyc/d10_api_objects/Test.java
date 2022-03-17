package com.wyc.d10_api_objects;

import java.util.Objects;

/**
 * Objects类的常用方法
 * 重点Objects.equals()
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "wyc";
//        System.out.println(s1.equals(s2)); //空指针异常
        System.out.println(Objects.equals(s2, s1)); //安全，准确
        /*
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
        */

    }
}
