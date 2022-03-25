package com.wyc.d5_collection_list;

import java.util.LinkedList;

public class LinkListDemo1 {
    public static void main(String[] args) {
        // 栈
        LinkedList<String> stack = new LinkedList<>();

        // 入栈
        stack.addFirst("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");

        // 出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        // 队
        LinkedList<String> queue = new LinkedList<>();

        // 入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
