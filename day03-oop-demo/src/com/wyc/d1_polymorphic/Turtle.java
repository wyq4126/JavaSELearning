package com.wyc.d1_polymorphic;

public class Turtle extends Animal{
    @Override
    public void run() {
        System.out.println("turtle run slowly");
    }

    /**
     * 独有功能
     */
    public void layEggs(){
        System.out.println("egg turtle");
    }
}
