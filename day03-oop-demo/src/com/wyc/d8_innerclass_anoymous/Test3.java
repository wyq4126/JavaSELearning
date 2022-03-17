package com.wyc.d8_innerclass_anoymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 通过GUI，理解匿名内部类的使用场景
 */
public class Test3 {
    public static void main(String[] args) {
        JFrame win = new JFrame("登录界面");

        // 添加
        JPanel panel = new JPanel();
        win.add(panel);
        JButton btn = new JButton("登录");

        // 匿名内部类的使用
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "click");
//            }
//        });

        btn.addActionListener(e->JOptionPane.showMessageDialog(win, "click"));

        panel.add(btn);

        // 展示窗口
        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
