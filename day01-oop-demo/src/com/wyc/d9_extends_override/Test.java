package com.wyc.d9_extends_override;

public class Test {
    public static void main(String[] args) {
        // 认识方法重写
        NewPhone n = new NewPhone();
        n.call();
        n.sendMsg();
    }
}

/**
 * 旧手机，父类
 */
class Phone {
    public void call() {
        System.out.println("calling");
    }

    public void sendMsg() {
        System.out.println("sendMsg");
    }

}

/**
 * 新手机，子类
 */
class NewPhone extends Phone{
    @Override
    public void call() {
        super.call();
        System.out.println("视频通话");
    }

    @Override
    public void sendMsg() {
        super.sendMsg();
        System.out.println("发送好看的图");
    }

}
