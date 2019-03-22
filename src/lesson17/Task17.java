package lesson17;

import javax.swing.*;
import java.awt.*;

public class Task17 extends JPanel {
    private int speedX = 5;
    private int speedY = 5;
    private int speedX1 = 10;
    private int speedY1 = 10;
    private int speedX2 = 15;
    private int speedY2 = 15;
    private int x = 30;
    private int y = 50;
    private int x1 = 40;
    private int y1 = 60;
    private int x2 = 50;
    private int y2 = 70;

    public static void start() {
        Task17 anim = new Task17();
        anim.go();

    }

    private void go() {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        while (true) {

            x += speedX;
            y += speedY;
            if (x >= (frame.getWidth() - (int)(drawPanel.getD()*1.4)))
                speedX = -5;
            if (x <= 0)
                speedX = 5;
            if (y >= (frame.getHeight() - (int)(drawPanel.getD()*1.8)))
                speedY = -5;
            if (y <= 0)
                speedY = 5;

            x1 += speedX1;
            y1 += speedY1;
            if (x1 >= (frame.getWidth() - (int)(drawPanel.getD()*1.4)))
                speedX1 = -10;
            if (x1 <= 0)
                speedX1 = 10;
            if (y1 >= (frame.getHeight() - (int)(drawPanel.getD()*1.8)))
                speedY1 = -10;
            if (y1 <= 0)
                speedY1 = 10;

            x2 += speedX2;
            y2 += speedY2;
            if (x2 >= (frame.getWidth() - (int)(drawPanel.getD()*1.4)))
                speedX2 = -15;
            if (x2 <= 0)
                speedX2 = 15;
            if (y2 >= (frame.getHeight() - (int)(drawPanel.getD()*1.8)))
                speedY2 = -15;
            if (y2 <= 0)
                speedY2 = 15;

            drawPanel.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class MyDrawPanel extends JPanel {
        private int d = 50;

        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x, y, d, d);

            g.setColor(Color.red);
            g.fillOval(x1, y1, d, d);

            g.setColor(Color.yellow);
            g.fillOval(x2, y2, d, d);

        }

        public int getD() {
            return d;
        }
    }
}
