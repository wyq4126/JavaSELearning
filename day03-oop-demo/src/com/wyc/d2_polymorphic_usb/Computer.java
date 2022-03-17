package com.wyc.d2_polymorphic_usb;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + "starting");
    }

    /**
     * 提供安装USB设备的入口
     */
    public void installUSB(USB usb) {
        // 多态 usb = mouse / keyboard
        usb.connect();
        // 独有功能：先判断 再强转
        if(usb instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        } else if(usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }
        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
