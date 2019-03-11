package lesson15.task15_2;

import java.util.Scanner;

public class Task15_2 {

    public static synchronized void print10() {
        int value = 1;
        for (int j = 0; j < 100; j++) {
            if (j % 10 == 0) {
                System.out.print(Thread.currentThread().getName() + ": " + value++ + " ");
            } else if (j % 10 == 9)
                System.out.print(value++ + "\n");
            else {
                System.out.print(value++ + " ");
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