package com.wyc.d3_static_util;

public class ArraysUtils {
    private ArraysUtils() {}

    public static void toString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ", " );
        }
        System.out.println("]");
    }

    public static double getAverage(double[] arr) {
        double min = arr[0];
        double max = arr[0];
        double average = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
            average += arr[i];
        }
        return average / (count-2);
    }

}
