package com.wyc.d2_polymorphic_usb;

public class Test {
    public static void main(String[] args) {
        // a.创建电脑对象
        Computer c = new Computer("aliens");
        c.start();

        // b.创建鼠标对象，键盘对象
        USB m = new Mouse("logitech");
        c.installUSB(m);
        USB k = new KeyBoard("lenovo");
        c.installUSB(k);
    }
}
