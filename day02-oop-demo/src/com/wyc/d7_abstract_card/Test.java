package com.wyc.d7_abstract_card;

public class Test {
    public static void main(String[] args) {
        GoldCard g = new GoldCard();
        g.setMoney(5000);
        g.setName("wyc");

        g.payMoney(200);
    }
}
