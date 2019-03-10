package lesson15;

import java.util.Scanner;

public class Task15_1 {

    public static void print10() {
        for (int i = 0; i < 10; i++) {
            int random = 1 + (int) (Math.random() * 100);
            String str = random + " ";
            System.out.print(str);
        }
        System.out.println();
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        MyThread thread = new MyThread ();
        thread.setName("Thread 2");

        if (string.equals("start")) {
            thread.start();
            Thread.currentThread().setName("Thread 1");
            while (true) {
                System.out.print(Thread.currentThread().getName() + ": ");
                Task15_1.print10();
            }
        }
    }
}