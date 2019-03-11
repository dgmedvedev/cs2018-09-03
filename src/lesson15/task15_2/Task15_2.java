package lesson15.task15_2;

import java.util.Scanner;

public class Task15_2 {

    public static synchronized void print10() {
        int random;
        System.out.print(Thread.currentThread().getName() + ": ");
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                random = 1 + (int) (Math.random() * 100);
                System.out.print(random + "\n");
            } else {
                random = 1 + (int) (Math.random() * 100);
                System.out.print(random + " ");
            }
        }
    }

    public static void start() {

        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        MyThread thread1 = new MyThread();
        thread1.setName("Thread 1");

        MyThread thread2 = new MyThread();
        thread2.setName("Thread 2");

        if (string.equals("start")) {

            thread1.start();
            thread2.start();

        }
    }
}