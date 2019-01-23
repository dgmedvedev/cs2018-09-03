package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {

    public static void start() {
        float[] mas = {0F, 3.1F, 7F, 7F, 0F, 5F, 7F, 3.1F, 7F, 20F};
        float[] copyMas = Arrays.copyOf(mas, mas.length);

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == copyMas[j]) {
                    count++;
                    copyMas[j] = new Random().nextFloat();
                }
            }
            if (count > 1)
                System.out.println("[" + mas[i] + "] - повторений " + count);
            count = 0;
        }
    }
}