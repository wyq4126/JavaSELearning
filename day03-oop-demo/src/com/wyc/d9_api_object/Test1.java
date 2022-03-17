package com.wyc.d9_api_object;


import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student ("hxh", 'f', 24);
        Student s2 = new Student ("hxh", 'f', 24);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(Objects.equals(s1, s2));
    }
}
