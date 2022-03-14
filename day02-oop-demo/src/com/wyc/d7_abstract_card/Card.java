package com.wyc.d7_abstract_card;

public abstract class Card {
    private String name;
    private double money;

    /**
     * 支付功能，子类一定要支付，所以定义为抽象方法
     */
    public abstract void payMoney(double money);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
