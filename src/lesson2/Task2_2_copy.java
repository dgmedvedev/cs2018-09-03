package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2_copy {
    private static float[] mas = {0F, 0F, 5F, 7F, 6F, 5F, 7F, 3.1F, 7F, 20F};
    private static float[] copyMas = Arrays.copyOf(mas, mas.length);

    public static void start() {

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == copyMas[j]) {
                    float num=new Random().nextFloat();
                    count++;
                    copyMas[j] = foundRandom(num);
                }
            }
            if (count > 1)
                System.out.println("[" + mas[i] + "] - повторений " + count);

            count = 0;
        }
        for(float xxx:copyMas)
        System.out.print(xxx+" ");
    }

    private static float foundRandom(float num) {

        boolean bool = true;

        while (bool) {

            for (int j=0;j<copyMas.length;j++) {
                if (num == copyMas[j]) {
                    float rand=new Random().nextFloat();
                    num=rand;
                    return num;
                }else return num;
            }bool = false;

        }return 0;
    }
}