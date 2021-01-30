package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private static String action = "";
    int calculateLeft = 0;
    int calculateRight = 0;
    private static int result = 0;


    public Calculator() {
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JLabel label = new JLabel();
        add(label);

        setLayout(new GridLayout(3, 5));

        JButton[] jbs = new JButton[14];

        jbs[0] = new JButton("1");
        jbs[1] = new JButton("2");
        jbs[2] = new JButton("3");
        jbs[3] = new JButton("+");
        jbs[4] = new JButton("*");
        jbs[5] = new JButton("4");
        jbs[6] = new JButton("5");
        jbs[7] = new JButton("6");
        jbs[8] = new JButton("-");
        jbs[9] = new JButton("/");
        jbs[10] = new JButton("7");
        jbs[11] = new JButton("8");
        jbs[12] = new JButton("9");
        jbs[13] = new JButton("=");



        for (int i = 0; i < jbs.length; i++) {
            jbs[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    action += e.getActionCommand();
                    label.setText(action);
                    if (isEqually(action)) {
                        calculate(action);
                        label.setText(String.valueOf(result));
                        action = "";
                    }


                }

            });
            add(jbs[i]);
        }

        setVisible(true);
    }

    private boolean isEqually(String action) {
        return action.contains("=");
    }

    public void calculate (String action) {
        action = action.replace("=","");
        if (action.contains("+")){
            String [] actionArrString = action.split("\\+");
            calculateLeft = Integer.parseInt(actionArrString[0]);
            calculateRight = Integer.parseInt(actionArrString[1]);
            result = calculateLeft + calculateRight;

        }
        if (action.contains("-")){
            String [] actionArrString = action.split("-");
            calculateLeft = Integer.parseInt(actionArrString[0]);
            calculateRight = Integer.parseInt(actionArrString[1]);
            result = calculateLeft - calculateRight;
        }
        if (action.contains("*")){
            String [] actionArrString = action.split("\\*");
            calculateLeft = Integer.parseInt(actionArrString[0]);
            calculateRight = Integer.parseInt(actionArrString[1]);
            result = calculateLeft * calculateRight;

        }
        if (action.contains("/")){
            String [] actionArrString = action.split("/");
            calculateLeft = Integer.parseInt(actionArrString[0]);
            calculateRight = Integer.parseInt(actionArrString[1]);
            result = calculateLeft / calculateRight;
        }


    }

    public static void main(String[] args) {
        new Calculator();
    }

}
