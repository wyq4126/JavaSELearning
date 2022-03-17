package com.wyc.d12_math;

public class MathDemo {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(-10));

        // 向上取整
        System.out.println(Math.ceil(4.0000000000001));

        // 向下取整
        System.out.println(Math.floor(4.999999999));

        // 次方
        System.out.println(Math.pow(2, 3));

        // 四舍五入
        System.out.println(Math.round(4.499999999999));

        // 0.0-1.0包前不包后
        System.out.println(Math.random());

        // 3-9
        // (0-6) + 3
        int data = (int)Math.random() * 7 + 3;
        System.out.println(data);
    }
}
