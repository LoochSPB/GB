package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Tic-Tac-Toe");
        setBounds(200, 100, 640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 3));
        JButton[] jbs = new JButton[9];
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("-");
            add(jbs[i]);
        }



        setVisible(true);

    }


    public static void main(String[] args) {
        new MyWindow();
    }



}
