package com.wyc.d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 手段
        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal b1 = BigDecimal.valueOf(0.2);
        BigDecimal c1 = a1.add(b1);

        // 目的：BigDecimal -> double
        double rs = c1.doubleValue();
        System.out.println(rs);

        // 注意事项：BigDecimal一定要精度运算
        BigDecimal a2 = BigDecimal.valueOf(10.0);
        BigDecimal b2 = BigDecimal.valueOf(3.0);
        /**
         * 参数1 除数
         * 参数2 保留小数位
         * 参数3 向上取整，四舍五入
         */
        BigDecimal c2 = a2.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println(c2);
    }
}
