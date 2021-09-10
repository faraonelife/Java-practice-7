package com.faraonelife.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorForm extends JFrame {
    private JPanel rootPnl;
    private JTextField InputtextField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;

    public CalculatorForm() {


        add(rootPnl);
       button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputtextField.setText(InputtextField.getText()+"7" );
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputtextField.setText(InputtextField.getText()+"8" );
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputtextField.setText(InputtextField.getText()+"9" );
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputtextField.setText(InputtextField.getText()+"/" );
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputtextField.setText(InputtextField.getText()+"4" );
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputtextField.setText(InputtextField.getText()+"5" );
            }
        });

        InputtextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if(!Character.isDigit(e.getKeyChar())){
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }



}
