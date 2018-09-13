package by.it.medvedev.lesson05;
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

import javafx.util.converter.IntegerStringConverter;

import java.util.*;

public class TaskC1qwe {
    public static void main(String[] args) throws Exception {
        ArrayList list1 = new ArrayList();
        Collections.addAll(list1, 5, 10, 15);
        ArrayList list2 = new ArrayList();
        Collections.addAll(list2, 3, 6, 9);
        ArrayList result = new ArrayList();

        result.addAll(list1);
        result.addAll(list2);


            System.out.print(result);

    }
}