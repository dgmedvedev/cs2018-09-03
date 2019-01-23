package lesson2;

import java.util.Arrays;

public class Task2_2 {

    public static void start() {
        float[] mas = {6F, 3.1F, 7F, 7F, 6F, 5F, 7F, 3.1F, 7F, 20F};
        float[] copyMas = Arrays.copyOf(mas, mas.length);

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == copyMas[j]) {
                    count++;
                    copyMas[j] = 0;
                }
            }
            if (count > 1)
                System.out.println("[" + mas[i] + "] - повторений " + count);
            count = 0;
        }
    }
}