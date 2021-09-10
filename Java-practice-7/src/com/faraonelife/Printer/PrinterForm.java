package com.faraonelife.Printer;

import javax.swing.*;


public class PrinterForm extends JFrame{
    private JPanel panel1;
    private JButton cancelButton;
    private JCheckBox imageCheckBox;
    private JCheckBox textCheckBox;
    private JCheckBox codeCheckBox;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton selectionRadioButton;
    private JRadioButton allRadioButton;
    private JRadioButton appletRadioButton;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JCheckBox printToFileCheckBox;
    private JButton OKButton;
    private JButton setupButton;
    private JButton helpButton;

    public PrinterForm() {
        comboBox1.addItem("High");
        comboBox1.addItem("Mid");
        comboBox1.addItem("Low");
        add(panel1);

    }
}
