package com.wyc.d8_innerclass_anoymous;

/**
 * 匿名内部类使用形式
 */
public class Test2 {
    public static void main(String[] args) {
        // 接口不是实例化，匿名内部类的使用（子类
        Swimming student = new Swimming() {
            @Override
            public void swim() {
                System.out.println("student swim");
            }
        };
        go(student);

        System.out.println("-----------");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("teacher swim");
            }
        });
    }

    // 学生，老师，运动员一起参加游泳比赛
    public static void go(Swimming s) {
        System.out.println("start");
        s.swim();
        System.out.println("finish");
    }
}

interface Swimming{
    void swim();
}
