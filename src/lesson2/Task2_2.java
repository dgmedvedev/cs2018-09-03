package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {

    public static void start() {
        float[] arr = {0F, 3.1F, 7F, 0F, 5F, 7F, 3.1F, 7F, 20F};
        methodSort(arr);
    }

    private static void methodSort(float[] a) {
        Arrays.sort(a);
        float value = 0;
        int count = 0;

        for (float temp : a) {
            if (temp != value&&count>1) {
                System.out.println("[" + value +"]" + " - повторений " + count);
                count = 0;
            }else if(temp != value&&count<2) {
                count = 0;
            }
            value = temp;
            count++;
        }
    }
}