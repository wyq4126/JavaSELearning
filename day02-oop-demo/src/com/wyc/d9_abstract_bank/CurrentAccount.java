package com.wyc.d9_abstract_bank;

/**
  活期账户
 */
public class CurrentAccount extends Account {
    public CurrentAccount(String cardId, double money) {
        super(cardId, money);
    }

    @Override
    public double calc() {
        double result =  getMoney() * 0.0175;
        return result;
    }

}
