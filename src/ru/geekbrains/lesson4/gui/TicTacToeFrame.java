package ru.geekbrains.lesson4.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeFrame extends JFrame {

    public TicTacToeFrame() {
        int height = 600;
        int width = 800;
        setTitle("TicTacToe");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setBounds((int)(screenSize.getWidth()/2) - width/2,
                (int)(screenSize.getHeight()/2) - height/2,
                width,
                height);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,3));


        for (int i = 0; i < 9; i++) {

            JButton button = new JButton(String.valueOf(i));
            add(button, new GridLayout());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button is pressed " + button.getText());
                }
            });
        }










        setVisible(true);

    }

    public static void main(String[] args) {
        new TicTacToeFrame();
    }
}
