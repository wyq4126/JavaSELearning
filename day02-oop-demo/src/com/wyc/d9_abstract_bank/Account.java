package com.wyc.d9_abstract_bank;

public abstract class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     模板方法
     */
    public final void handle(String loginName , String passWord ){
        // a.判断登录是否成功
        if("itheima".equals(loginName) && "123456".equals(passWord)){
            System.out.println("登录成功。。");
            // b.正式结算利息
            double result =  calc();
            // 结算利息功能应该是抽象方法
            // c.输出利息详情
            System.out.println("本账户利息是："+ result);
        }else{
            System.out.println("用户名或者密码错误了");
        }
    }

    /**
     * 抽象方法，计算利息
     * @return
     */
    public abstract double calc();

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
