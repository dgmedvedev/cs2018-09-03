package by.it_academy.medvedev.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        sort(mas);
    }

    public static void sort(int[] array) {

//сортировка в убывающем порядке

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int mas : array)
            System.out.println(mas);
    }
}