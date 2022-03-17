package com.wyc.d1_polymorphic;

public class Dog extends Animal{
    public String name = "son Dog";
    @Override
    public void run() {
        System.out.println("dog run fast");
    }
}
