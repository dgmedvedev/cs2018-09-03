package class_work.lesson16;

import lesson15.task15_1.Task15_1;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                int random = 100 + (int)(Math.random()+300);
                Thread.sleep(random);
                System.out.println("Работает " + Thread.currentThread().getName() + "; random = " + random);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}