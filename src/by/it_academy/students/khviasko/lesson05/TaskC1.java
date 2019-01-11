package by.it_academy.students.khviasko.lesson05;
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
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        ArrayList<Integer> clist = new ArrayList<>();
        for (Integer xList = 0; i <= list.size(); i++) {

            if (list.get(i) % 3 == 0)
                alist.add(i);
            else if (list.get(i) % 2 == 0)
                alist.add(i);
            else
                clist.add(i);
        }
        printList(alist);
        printList(blist);
        printList(clist);
    }
    private static void printList(List<Integer>List) {
             System.out.println(List);

    }

}
// || (list.get(i) % 3 == 0 && list.get(i) % 2 == 0)