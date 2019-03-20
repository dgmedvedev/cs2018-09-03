package lesson16.task16_2.task16_2_1;

import java.util.Scanner;

public class Task16_2_1 {
    public static void start() {
        MyThread thread = new MyThread();
        thread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        thread.end();   // может не сработать по причине плохой когерентности кэшей
                        // и thread продолжит выполняться до бесконечности
    }
}