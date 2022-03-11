package com.wyc.d1_static_demo;

    // 目标：理解static访问相关的方法
public class Test3 {
    /**
     * 静态成员
     */
    public static int onlineNum = 10;
    public static void test2() {
        System.out.println("*******");
    }

    /**
     * 实例成员
     */
    private String name;
    private void test3() {
        System.out.println("************");
    }

    // 1.静态方法只能访问静态成员，不能直接访问实例成员[创建对象来访问可以
    public static void test1() {
        System.out.println(Test3.onlineNum);
        test2();

        Test3 t = new Test3();
        System.out.println(t.name);
        t.test3();
    }

    //2. 实例方法可以访问静态成员，也能访问实例成员
    public void go() {
        System.out.println(Test3.onlineNum);
        test2();
        this.name = "dada";

        System.out.println(name);
        test3();
    }

    //3. 静态方法中不可以出现this关键字
    public static void thisTest() {
//        this.name = "  ";  //this代表当前对象，但静态方法是给所有对象用
    }


    public static void main(String[] args) {

    }
}
