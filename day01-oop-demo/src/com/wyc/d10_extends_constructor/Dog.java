package com.wyc.d10_extends_constructor;

public class Dog extends Animal {
    public Dog() {
        System.out.println("子类无参");
    }

    public Dog(int n) {
        System.out.println("子类有参");
    }
}
