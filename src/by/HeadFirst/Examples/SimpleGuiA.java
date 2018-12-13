package by.HeadFirst.Examples;

import javax.swing.*;
import java.awt.*;

public class SimpleGuiA {
    public static void main(String[] args) {
        SimpleGuiA guiA = new SimpleGuiA();
        guiA.go();
    }
    void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setSize(150,300);
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        JButton button3 = new JButton("Кнопка 3");
        button1.setBackground(Color.red);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.green);
        JTextField field1 = new JTextField(30);
        JTextField field2 = new JTextField(20);
        JTextField field3 = new JTextField(10);

        panel.add(button1);
        panel.add(field1);

        panel.add(button2);
        panel.add(button3);
        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
