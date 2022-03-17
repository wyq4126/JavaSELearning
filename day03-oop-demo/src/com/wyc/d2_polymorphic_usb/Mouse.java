package com.wyc.d2_polymorphic_usb;

public class Mouse implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出");
    }

    public void click() {
        System.out.println(name + "一键三连哈哈");
    }
}
