package com.wyc.d1_static_demo;

public class Student {
    /**
     * 实例成员变量，属于对象
     */
    private String name;

    /**
     * 静态成员方法
     * 属于类，共享访问，用类名对象名都可以访问
     */
    public static int getMax(int age1, int age2) {
        if(age1 > age2) {
            return age1;
        } else {
            return age2;
        }
    }

    /**
     * 实例方法，用对象名访问
     */
    public void study() {
        System.out.println(name + " studying");
    }

    public static void main(String[] args) {
        // 静态方法【类
        System.out.println(Student.getMax(10, 3));
        System.out.println(getMax(10, 32));

        // 实例方法【对象
        Student stu = new Student();
        stu.name = "ddd";
        stu.study();

        // 静态方法【对象 不推荐
        System.out.println(stu.getMax(10, 30));
    }
}
