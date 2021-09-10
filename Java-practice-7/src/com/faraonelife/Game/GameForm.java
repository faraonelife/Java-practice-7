package com.faraonelife.Game;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;;

public class GameForm extends JFrame {
    private JTextField jTextField;
    private JLabel InsLbl;
    private JLabel CondLbl;
    private JButton NewBtn;
    private JButton InsBtn;
    private JLabel MainLbl;
    private int randomNumber;

    public GameForm()
    { super("Random game #4");
    setLayout(new FlowLayout());
    MainLbl = new JLabel("I have a number between 1 and 1000,Can you guess my number?");
    InsLbl = new JLabel("Please enter your first guess.");
        NewBtn = new JButton("New Game");
        InsBtn = new JButton("ENTER");
        CondLbl = new JLabel("");
        randomNumber = new Random().nextInt(1000) + 1;
        jTextField = new JTextField(10);
        NewBtnHnd newhandler = new NewBtnHnd();
        NewBtn.addActionListener(newhandler);
        InsBtnHnd inshandler = new InsBtnHnd();
        InsBtn.addActionListener(inshandler);
        add(MainLbl);
        add(InsLbl);
        add(jTextField);
        add(NewBtn);
        add(InsBtn);
        add(CondLbl);


    }
    class InsBtnHnd implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {


                int number=0;
                number = Integer.parseInt(jTextField.getText());


                if (number > randomNumber)
                {
                    CondLbl.setText("Too High.");
                    getContentPane().setBackground(Color.RED);
                    SwingUtilities.updateComponentTreeUI(CondLbl);
                }
                else if (number < randomNumber)
                {
                    CondLbl.setText("Too Low.");
                    getContentPane().setBackground(Color.BLUE);
                    SwingUtilities.updateComponentTreeUI(CondLbl);
                }
                else if (number == randomNumber)
                {
                    CondLbl.setText("Correct!");
                    getContentPane().setBackground(Color.GREEN);
                    SwingUtilities.updateComponentTreeUI(CondLbl);
                    jTextField.setEditable(false);
                }


        }
    }
    class NewBtnHnd implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            getContentPane().setBackground(Color.MAGENTA);
            CondLbl.setText("");
            randomNumber = new Random().nextInt(1000) + 1;
        }
    }



    }
