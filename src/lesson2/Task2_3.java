package lesson2;

import java.util.Random;

public class Task2_3 {
    public static void start() {
        int[] mas = new int[new Random().nextInt(10)+5];
        for (int i = 0; i < mas.length; i++)
            mas[i] = new Random().nextInt(100);
        for (int print : mas) {
            System.out.printf("%02d", print);
            System.out.print(" ");
        }
        sort(mas);

    }

    private static void sort(int[] sortMas) {
        for (int i = 0, j = sortMas.length - 1; i < sortMas.length / 2; i++, j--) {
            int temp = sortMas[i];
            sortMas[i]=sortMas[j];
            sortMas[j]=temp;
        }
        System.out.println();
        for(int print:sortMas) {
            System.out.printf("%02d", print);
            System.out.print(" ");
        }
    }
}
