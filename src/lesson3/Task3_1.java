package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3_1 {

    public static void start() {
        int[] arr = new int[10];
        enterArray(arr);
        printArray(arr);
        selectionSort(arr);
        //2-ой способ   bubbleSort(arr);
        //3-ий способ   Arrays.sort(arr);
        printArray(arr);
        evenInt(arr);
    }

    private static void enterArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    private static void printArray(int[] a) {
        for (int i : a)
            System.out.print("\"" + i + "\"|");
        System.out.println();
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = a[i];
                a[i] = a[min_i];
                a[min_i] = tmp;
            }
        }
    }

    private static void bubbleSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    private static void evenInt(int[] a) {
        for (int i : a) {
            if (i % 2 == 0)
                System.out.print("\"" + i + "|");
        }
        System.out.println();
    }
}