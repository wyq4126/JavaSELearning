package com.wyc.d5_static_sigleinstance;

/**
 * 懒汉单例模式
 */
public class SingleInstance2 {
    // 2.定义静态成员变量存储一个对象
    // 只加载一次，内存中只有一份
    // 注意此处需要私有化，不要开放给test中
    private static SingleInstance2 instance2;

    // 1.私有构造器
    private SingleInstance2() {
    }

    // 3.提供一个方法，对外返回单例对象
    public static SingleInstance2 getSingleInstance2() {
        if(instance2 == null) {
            //第一次拿对象，此时需要创建对象
            instance2 = new SingleInstance2();
        }
        return instance2;
    }
}
