package com.faraonelife.TempConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConverterForm extends JFrame implements  ActionListener {
    private JPanel PanelCon;
    private JTextField textField1;
    private JLabel Convertion_ans;
    private JButton button1;

    public ConverterForm() {
        super("Temperature Conversion");
        add(PanelCon);
        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
          double fahrenheit_from_in = Double.parseDouble(textField1.getText());
          double Celsius = 0.0;
          Celsius = ((5.0 / 9.0) * (fahrenheit_from_in - 32.0));
          Convertion_ans.setText(String.format("Degree in Celsius %.2f",Celsius));

   }

}
