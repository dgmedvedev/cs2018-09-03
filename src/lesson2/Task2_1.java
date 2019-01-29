package lesson2;

import java.util.Arrays;

public class Task2_1 {
    public static void start() {
        int[] mas = new int[]{10, 1, 12, 3, 89, 325, 777, 67, 9, 55};
        int min = mas[0], indexMin = 0;
        int max = mas[0], indexMax = 0;

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            } else if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            }
        }

        System.out.println("min value = " + min + ".");
        System.out.println("max value = " + max + ".");

        mas[indexMin]=0;
        mas[indexMax]=99;

        String str = Arrays.toString(mas);
        System.out.println(str + ".");
    }
}