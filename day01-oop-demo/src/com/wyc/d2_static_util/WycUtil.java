package com.wyc.d2_static_util;

import java.util.Random;

/**
 * 工具类
 */
public class WycUtil {
    /**
     * 由于工具类无需创建对象，所以可以把构造器私有化
     */
    private WycUtil() {}

    /**
     * 静态方法
     */
    public static String createVerifyCode(int n) {
        String code = "";
        String verifyCode = "ABCDEFGHIJKLSMNOPWXYZabcdlfopuwxyz0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(verifyCode.length());
            // 获取随机索引对应字符
            char ch = verifyCode.charAt(index);
            code += ch;
        }
        return code;
    }
}
