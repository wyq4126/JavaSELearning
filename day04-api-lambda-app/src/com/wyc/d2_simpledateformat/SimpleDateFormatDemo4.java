package com.wyc.d1_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo4 {
    public static void main(String[] args) throws ParseException {
        // 1.开始结束时间
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";

        // 2.小佳小皮
        String jiaTime = "2021-11-11 00:03:20";
        String piTime  = "2021-11-11 00:11:06";

        // 3.解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(jiaTime);
        Date d4 = sdf.parse(piTime);

       System.out.println(d3.after(d1) && d3.before(d2) ? "jia success" : "jia failed");
       System.out.println(d4.after(d1) && d4.before(d2) ? "pi success" : "pi failed");
    }
}
