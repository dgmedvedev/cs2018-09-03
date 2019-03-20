package lesson16.task16_2.task16_2_2;

import java.util.Scanner;

public class Task16_2_2 {
    public static void start() {
        MyThread thread = new MyThread();
        thread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        thread.end();   // сработает 100%
    }
}