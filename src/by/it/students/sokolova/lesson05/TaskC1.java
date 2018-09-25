package by.it.students.sokolova.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
    1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if (x % 3 == 0)
                list1.add(x);
            if (x % 2 == 0)
                list2.add(x);
            if ((x % 3 == 0) && (x % 2 == 0))
                list1.add(x);
                list2.add(x);
            if ((x % 3 !=0) && (x % 2 != 0))
                list3.add(x);

        }
        for (int i = 0; i < list1.size(); i++) {
            printList(list1);
        }
        for (int i = 0; i < list2.size(); i++) {
            printList(list1);
        }
        for (int i = 0; i < list3.size(); i++) {
            printList(list1);
        }


    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list)
            System.out.println(aList);
    }


}

