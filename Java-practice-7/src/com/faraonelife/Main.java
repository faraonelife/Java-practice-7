package com.faraonelife;

import com.faraonelife.Calculator.CalculatorForm;
import com.faraonelife.Game.GameForm;
import com.faraonelife.Printer.PrinterForm;
import com.faraonelife.TempConverter.ConverterForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //program 1
        JFrame mainWindow =new CalculatorForm();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(300,400);
        mainWindow.setVisible(true);
        //program 2
        JFrame Random = new GameForm();
        Random.setVisible(true);
        Random.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Random.setSize(600,250);
        //program 3
        JFrame printer=new PrinterForm();
        printer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        printer.setSize(800,250);
        printer.setVisible(true);
        //program 4
        JFrame converter=new ConverterForm();
        converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converter.setSize(400,400);
        converter.setVisible(true);




    }
}
