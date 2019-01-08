package by.HeadFirst.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstGui {
    private JButton button2, button3;
    private JTextArea nameColor2, nameColor3;

    public static void main(String[] args) {
        MyFirstGui mfg = new MyFirstGui();
        mfg.start();
    }

    private void start() {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Color colorPanel = new Color(50, 250, 200);
        panel.setBackground(colorPanel);

        nameColor2 = new JTextArea(6, 12);
        JScrollPane _2scroller = new JScrollPane(nameColor2);
        _2scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        _2scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nameColor3 = new JTextArea(6, 12);
        JScrollPane _3scroller = new JScrollPane(nameColor3);
        _3scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        _3scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton button1 = new JButton("Кнопка 1");
        button1.addActionListener(new ClickMeListener());
        button2 = new JButton("Кнопка 2");
        button2.addActionListener(new Button2Listener());
        button3 = new JButton("Кнопка 3");
        button3.addActionListener(new Button3Listener());

        panel.add(button2);
        panel.add(button3);
        panel.add(nameColor2);
        panel.add(nameColor3);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu optionMenu = new JMenu("Option");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(new NewListener());
        newMenuItem.setBackground(colorPanel);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem easyMenuItem = new JMenuItem("Easy");
        JMenuItem hardMenuItem = new JMenuItem("Hard");

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        optionMenu.add(easyMenuItem);
        optionMenu.add(hardMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(optionMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        //    frame.getContentPane().add(BorderLayout.WEST,_2scroller);
        //    frame.getContentPane().add(BorderLayout.EAST,_3scroller);
        frame.setSize(300, 250);
        frame.setVisible(true);
    }

    public class NewListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("New");
        }
    }

    public class ClickMeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("получилось");
            System.out.println("Цвет Кнопки 2 - " + nameColor2.getText());
            System.out.println("Цвет Кнопки 3 - " + nameColor3.getText());
        }
    }

    public class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color randomColor2 = new Color(red, green, blue);
            button2.setBackground(randomColor2);
            nameColor2.setText("(" + red + "," + green + "," + blue + ")");
        }
    }

    public class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color randomColor2 = new Color(red, green, blue);
            button3.setBackground(randomColor2);
            nameColor3.setText("(" + red + "," + green + "," + blue + ")");
        }
    }
}