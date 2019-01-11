package by.it_academy.students.khviasko.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
        int a, b, t = 1;
        for (a=1;a<m.length;a++)
            for (b = m.length - 1; b >= a; b--) {
                if (m[b - 1] < m[b]) {
                    t = m[b - 1];
                    m[b - 1] = m[b];
                    m[b] = t;
                }
            }
        for (int element : m) {
            System.out.println(element);
        }
    }
}

//Напишите тут ваш кодpublic static void sort ( int[] array){