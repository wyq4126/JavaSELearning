package com.wyc.d1_package;

import com.wyc.d1_package.demo1.Animal;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        // 不同包下的类必须导包才能使用
        Animal a = new Animal();
        com.wyc.d1_package.demo2.Animal a2 = new  com.wyc.d1_package.demo2.Animal();

        a.run();
        a2.run();

    }
}
