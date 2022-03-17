package com.wyc.d13_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((Math.abs(startTime - endTime) / 1000.0));



        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6];

        System.arraycopy(arr1, 3, arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
