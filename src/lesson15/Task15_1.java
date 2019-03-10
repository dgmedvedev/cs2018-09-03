package lesson15;

import java.util.Scanner;

public class Task15_1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Thread thread = new Thread("Thread 2") {
            @Override
            public void run() {
                while (true) {
                    System.out.print(Thread.currentThread().getName() + ": ");
                    Task15_1.print10();
                }
            }
        };

        if (str.equals("start")) {
            thread.start();
            Thread.currentThread().setName("Thread 1");
            while (true) {
                System.out.print(Thread.currentThread().getName() + ": ");
                Task15_1.print10();
            }
        }
    }

    private static void print10() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int random = 1 + (int) (Math.random() * 100);
            str.append(random).append(" ");
        }
        System.out.println(str);
    }
}