package by.it.tomashevskaya.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
        int[] a = new int[10];
        System.arraycopy(m, 0, a, 0, 10);
        System.out.println("a=" + Arrays.toString(a));
        int[] b = new int[10];
        System.arraycopy(m, 10, b, 0, 10);
        System.out.println("b=" + Arrays.toString(b));
    }

}

