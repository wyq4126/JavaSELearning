package com.wyc.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        // 1.多态的形式
        //   父类类型 对象名称 = new 子类构造器；
        Animal a1 = new Dog();
        a1.run();   // [方法]编译看左边【看看Animal有没有run方法，运行看右边【用右边Dog里的run方法
        System.out.println(a1.name);

        Animal a2 = new Turtle();
        a2.run();
        System.out.println(a2.name);// [变量]编译看左边，运行看左边

        if(a2 instanceof Turtle) {
            Turtle t = (Turtle) a2;
            t.layEggs();

        }

    }
}
