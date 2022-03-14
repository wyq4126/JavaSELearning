package com.wyc.d7_abstract_card;

public class GoldCard extends Card{
    @Override
    public void payMoney(double money) {
        System.out.println("当前账户为" + getName() + ";当前账户余额为" + getMoney());
        System.out.println("优惠后的金额为" + money * 0.8);
        System.out.println("消费后余额为" + (getMoney() - money*.8));
        setMoney(getMoney() - money*.8);
    }
}
