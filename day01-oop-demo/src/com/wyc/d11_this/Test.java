package com.wyc.d11_this;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("wyc");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("werc", "华南理工");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}

