package com.wyc.d11_interface_implements;

public class PingPongMan implements SportMan, Law{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(name + " rule the law");
    }

    @Override
    public void run() {
        System.out.println(name + " run fast");
    }
}
