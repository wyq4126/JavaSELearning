package com.wyc.d1_date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) {
        // 1.日期对象
        Date d = new Date();
        System.out.println(d);

        // 2.格式化日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        // 3.格式化日期对象成为喜欢的字符串
        String rs1 = sdf.format(d);
        System.out.println(rs1);
        System.out.println("======================");

        // 4.格式化时间毫秒值
        long time1 = System.currentTimeMillis();
        String rs2 = sdf.format(time1);
        System.out.println(rs2);
    }
}
