package lesson2;

import java.util.Random;

public class Task2_5 {
    public static void start() {
        int[] mas = new int[new Random().nextInt(10) + 5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Random().nextInt(100);
        }
        for (int print : mas) {
            System.out.printf("%02d", print);
            System.out.print(" ");
        }
        System.out.println();

        for (int j = mas.length - 1; j >= 0; j--) {
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    int temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
        }
        for (int print : mas) {
            System.out.printf("%02d", print);
            System.out.print(" ");
        }
    }
}