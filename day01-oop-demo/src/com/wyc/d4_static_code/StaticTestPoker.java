package com.wyc.d4_static_code;

import java.util.ArrayList;

public class StaticTestPoker {


    public static ArrayList<String> cards = new ArrayList<>();
    static {
        //a.定义数组存储全部点数：类型定；个数定
        String[] sizes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //b.定义数组存储全部花色：类型定，个数定
        String[] colors = {"♥", "♣", "♦", "♠"};
        //c.遍历点数
        for (int i = 0; i < sizes.length; i++) {
            //d.遍历花色
            for (int j = 0;  j < colors.length; j++) {
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        //e.单独加入大小王
        cards.add("大王");
        cards.add("小王");
    }

    public static void main(String[] args) {
        System.out.println("新牌：" + cards);
    }
}
