package lesson2;

import java.util.Arrays;

public class Task2_1 {
    public static void start() {
        int[] mas = new int[]{10, 74, 12, 3, 89, 325, 777, 67, 9, 55};
        int min = mas[0];
        int max = mas[0];

        for (int i = 1, j = 1; i < mas.length; i++, j++) {
            if (min > mas[i]) min = mas[i];
        }
        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) max = mas[i];
        }
        System.out.println("min value = " + min + ".");
        System.out.println("max value = " + max + ".");

        for (int i = 0; i < mas.length; i++) {
            if (min == mas[i]) mas[i] = 0;
            if (max == mas[i]) mas[i] = 99;
        }

        String str = Arrays.toString(mas);
        System.out.println(str);
    }
}