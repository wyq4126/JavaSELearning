package com.wyc.d5_static_sigleinstance;

/**
 * 使用饿汉单例模式
 */
public class SingleInstance1 {
    //2. 对象提前准备好，定义静态成员变量记住【只加载一次
    public static SingleInstance1 instance = new SingleInstance1();

    //1. 私有化构造函数
    private SingleInstance1() {
    }
}
