package com.wyc.d5_innerclass_static;

/**
 * 外部类
 */
public class Outer {
    private String hobby;

    public static class Inner{
        private String name;
        private int age;

        public static int a = 150;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println(a);
            // 静态内部类不能直接访问外部类的实例成员
            Outer o = new Outer();
            System.out.println(o.hobby);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

        public static String schoolName;
    }

}
