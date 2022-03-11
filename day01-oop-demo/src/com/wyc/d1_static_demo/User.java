package com.wyc.d1_static_demo;

public class User {
    /**
     * 实例成员变量
     */
    public String name;
    public int age;

    /**
     * 在线人数
     */
    public static int onlineNumber = 161;


    public static void main(String[] args) {
        System.out.println(User.onlineNumber);
        User u = new User();
    }
}
