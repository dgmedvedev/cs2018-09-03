package by.it_academy.medvedev.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++)
            mas[i] = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0 || (mas[i] % 3 == 0 && mas[i] % 2 == 0))
                list1.add(mas[i]);
            if (mas[i] % 2 == 0 || (mas[i] % 3 == 0 && mas[i] % 2 == 0))
                list2.add(mas[i]);
            if (mas[i] % 3 != 0 && mas[i] % 2 != 0 && (mas[i] % 3 != 0 && mas[i] % 2 != 0))
                list3.add(mas[i]);
        }

        for (Integer aList : list1) System.out.println(aList);
        for (Integer bList : list2) System.out.println(bList);
        for (Integer cList : list3) System.out.println(cList);
    }

}