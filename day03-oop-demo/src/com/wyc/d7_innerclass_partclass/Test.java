package com.wyc.d7_innerclass_partclass;

public class Test {
    public static void main(String[] args) {
        class Cat{
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c = new Cat();
        c.setName("wyc");
    }
}
