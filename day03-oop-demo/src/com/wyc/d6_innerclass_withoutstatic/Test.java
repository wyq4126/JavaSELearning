package com.wyc.d6_innerclass_withoutstatic;

public class Test {
    public static void main(String[] args) {
        // 成员内部类的创建方法
        Outer.Heart o = new Outer().new Heart();
        o.show();
    }
}
