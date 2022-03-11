package com.wyc.d6_extends;

/**
 * 子类
 */
public class Student extends People {
    /**
     * 独有行为，填写反馈信息
     */
    public void writeInfo() {
        System.out.println(getName() + "反馈信息。");
    }
}
