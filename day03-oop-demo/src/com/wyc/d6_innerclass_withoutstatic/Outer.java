package com.wyc.d6_innerclass_withoutstatic;

/**
 * 外部类
 */
public class Outer {
    private int heartbeat = 150;

    /**
     * 成员内部类，不加static修饰
     */
    public class Heart {
        private int heartbeat = 110;

        public void show() {
            int heartbeat = 78;
            System.out.println(heartbeat);

            System.out.println(this.heartbeat);

            System.out.println(Outer.this.heartbeat);
        }
    }

}
