package com.wyc.d7_genericity;

import java.util.ArrayList;

public class MyArrayList<E> {
    ArrayList<E> list = new ArrayList<>();

    public void add(E e) {
        list.add(e);
    }

    public void remove(E e) {
        list.remove(e);
    }
}
