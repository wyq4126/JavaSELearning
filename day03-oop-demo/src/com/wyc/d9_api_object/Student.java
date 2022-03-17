package com.wyc.d9_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Student {name=" + name + ", sex=" + sex + ", age=" + age + "}";
//    }
//

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    /**
     * 自己定制相等规则，两个对象内容一样就返回true
     * s1.equals(s2)
     * 比较者   s1 -> this
     * 被比较者 s2 -> o
     */
//    @Override
//    public boolean equals(Object o){
//        // 1.判断类型
//        if(o instanceof Student) {
//            // 2.判断内容是否一样
//            Student s2 = (Student) o;
//            // String一定要用equals比较内容！！！
////            if(this.name.equals(s2.name) &&
////            this.sex == s2.sex && this.age == s2.age) {
////                return true;
////            } else {
////                return false;
////            }
//            return this.name.equals(s2.name) &&
//                    this.sex == s2.sex && this.age == s2.age;
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        // 1.判断同一对象
        if (this == o) return true;
        // 2.o是null || 比较s1 s2的类型
        if (o == null || getClass() != o.getClass()) return false;
        // 3.o不是null，也是学生类型，开始转
        Student student = (Student) o;
        return this.sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }
}
