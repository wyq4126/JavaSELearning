package com.wyc.d6_extends;

public class People {
    String name;
    int age;

    /**
     * 查看课表
     */
    public void queryCourse() {
        System.out.println(this.name + "kebiao!!");
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
}
