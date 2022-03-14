package com.wyc.d9_abstract_bank;

/**
    定期账户
 */
public class FixedAccount extends Account {
    @Override
    public double calc() {
        double result =  getMoney() * 0.035; // 结算利息了
        if(getMoney() >= 100000){
            result += getMoney() * 0.03;
        }
        return result;
    }
}
