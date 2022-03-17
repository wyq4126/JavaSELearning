package com.wyc.d8_innerclass_anoymous;

public class Test {
    public static void main(String[] args) {
        // 不需要定义子类，把抽象类中的抽象方法直接重写在右边
        Animal tiger = new Animal() {
            @Override
            public void run() {
                System.out.println("Tiger run fast");
            }
        };
//        a.run();
    }
}

//class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("Tiger run fast");
//    }
//}

abstract class Animal{
    public abstract void run();
}
