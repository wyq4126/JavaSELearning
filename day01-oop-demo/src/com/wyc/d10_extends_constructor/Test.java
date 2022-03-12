package com.wyc.d10_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //子类全部构造器会默认访问父类的无参构造器再执行自己
        Dog d1 = new Dog();
        System.out.println(d1);

        System.out.println("------------");
        Dog d2 = new Dog(2);
        System.out.println(d2);
    }
}
