package by.it1.decisions_9h37m53s.lesson05_4h27m21s;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        sort(mas);
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}