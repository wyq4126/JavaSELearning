package com.wyc.d7_extends_feture;

public class Test {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("eating");
    }

}

class Tiger extends Animal {

}
