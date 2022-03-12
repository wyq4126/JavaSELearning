package com.wyc.d8_extends_field_method;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.lookDoor();
        d.showName();
    }
}

class Animal {
    public String name = "animal";
    public void run() {
        System.out.println("动物run!!");
    }
}

class Dog extends Animal {
    public String name = "dog";

    public void lookDoor() {
        System.out.println("狗看门");
    }

    public void run() {
        System.out.println("狗跑得好快");
    }

    public void showName() {
        // 当前name（也就是子类的name
        System.out.println(this.name);
        // 父类name
        System.out.println(super.name);

        // 子类的run
        this.run();
        // 父类的run
        super.run();
    }
}


