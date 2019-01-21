package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task2_2 {
    private static float[] mas = {0F, 0F, 5F, 7F, 6F, 5F, 7F, 3.1F, 7F, 20F};
    private static float[] copyMas = Arrays.copyOf(mas, mas.length);

    public static void start() {

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == copyMas[j]) {
                    count++;
                    copyMas[j] = foundRandom(new Random().nextFloat());
                }
            }
            if (count > 1)
                System.out.println("[" + mas[i] + "] - повторений " + count);

            count = 0;
        }
    }

    private static float foundRandom(float num) {
        for (float x : mas) {
            if (num != x)
                return num;
            else return 0;
        }
        return 0;
    }
}