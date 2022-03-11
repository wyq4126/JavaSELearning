package com.wyc.d3_static_util;

public class TestDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 90, 5, -1};
        ArraysUtils.toString(a);

        double[] b = {1., -999., 999., 500., 2., 30.};
        System.out.println(ArraysUtils.getAverage(b));
    }

}
