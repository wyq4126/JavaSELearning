package com.wyc.d11_stringbuilder;

/**
 * 学会StringBuilder
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append(1);
        sb.append(false);
        sb.append(3.3);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        // 支持链式编程
        sb1.append("a").append("安安带我走吧").append("包安请结婚");
        // 反转
        sb1.reverse().append(48);
        System.out.println(sb1);
        System.out.println(sb1.length());

        // StringBuilder只是拼接字符串的手段，效率高
        // 最终的结果还是会恢复成String对象
        StringBuilder sb2 = new StringBuilder();
        sb2.append("wyc").append("48");
        // 恢复成toString
        String rs = sb2.toString();
        check(rs);
    }

    public static void check(String data) {
        System.out.println(data);
    }
}
