package by.HeadFirst.Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiB implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGuiB gui = new SimpleGuiB();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Click me");
        MyDrawPanel panel = new MyDrawPanel();
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }

    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            long sum = 0;
            long i = 0;
            while (true) {
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);
                int red1 = (int) (Math.random() * 255);
                int green1;
                int blue1;

                if (red == green && green == blue) {
                    green1 = (int) (Math.random() * 255);
                    blue1 = (int) (Math.random() * 255);

                    Color random = new Color(red, green, blue);
                    g.setColor(random);
                    g.fillRect(0, 0, this.getWidth(), this.getHeight());

                    Color random1 = new Color(red1, green1, blue1);
                    g.setColor(random1);
                    g.fillOval(20, 50, 100, 100);

                    System.out.println(sum);
                    break;
                }sum = i++;
            }
        }
    }
}