package com.wyc.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        System.out.println(Outer.Inner.a);
    }
}
