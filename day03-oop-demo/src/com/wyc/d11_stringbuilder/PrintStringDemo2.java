package com.wyc.d11_stringbuilder;

public class PrintStringDemo2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = null;
        System.out.println(toString(arr1));
        System.out.println(toString(arr2));
    }


    /**
     * 返回数组显示格式
     * @param arr
     * @return
     */
    public static String toString(int[] arr) {
        if(arr == null) return null;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i == arr.length-1 ? "" : ", ");
        }
        sb.append("]");
        return sb.toString();
    }
}


