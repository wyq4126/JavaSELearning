package com.wyc.d7_extends_feture;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("eating");
        System.out.println("now!!!!");
    }
}

class Tiger extends Animal {

}
