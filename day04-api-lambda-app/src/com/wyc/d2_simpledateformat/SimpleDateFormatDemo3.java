package com.wyc.d1_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算2021.8.6 11:11:11往后走2天14h49分06秒
 * 【SimpleDateFormat解析
 */
public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        // 1.使用SimpleDateFormat解析字符串成为日期对象
        String dataStr = "2021.8.6 11:11:11";

        // 2.把字符串解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date d = sdf.parse(dataStr);

        // 3.往后算2天14小时49分06秒，输出
        long time = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;
        System.out.println(sdf.format(time));
    }
}
