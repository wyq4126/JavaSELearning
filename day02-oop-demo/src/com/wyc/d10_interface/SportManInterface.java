package com.wyc.d10_interface;

public interface SportManInterface {
    // JDK1.8之前，接口中的成员只有常量和抽象方法
    // public static final String SCHOOL_NAME = "WYC"; public static final可以不写
    String SCHOOL_NAME = "WYC";

    // 抽象方法
    // public abstract void run();
    // public abstract void eat();
    void run();
    void eat();
}
