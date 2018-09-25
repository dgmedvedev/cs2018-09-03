package by.it.students.ermakova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskC2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)

            sort( array );

            for (int x : array) {
                System.out.println( x );
            }
        }




    public static void sort(int[] array) {
        int s;
        for (int i = 0; i < array.length; i++) {
            for (int h = 0; h < array.length; h++) {
                if (array[i] > array[h]) {
                    s = array[h];
                    array[h] = array[i];
                    array[i] = s;
break;
                }

            }
        }
    }

}
