package by.it.andruhin.lesson05;
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

import jdk.nashorn.api.tree.IfTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskC1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> MyList = new LinkedList<>();
        LinkedList<Integer> ListDiv3 = new LinkedList<>();
        LinkedList<Integer> ListDiv2 = new LinkedList<>();
        LinkedList<Integer> ListOther = new LinkedList<>();
        for (int i = 0; i < 20; i++)
        {
            MyList.add(sc.nextInt());
        }
        for (int i : MyList)
        {
            boolean IsOther = true;
            if(i%3 == 0)
            {
                IsOther = false;
                ListDiv3.add(i);
            }
            if(i%2 == 0)
            {
                IsOther = false;
                ListDiv2.add(i);
            }
            if (IsOther)
            {
                ListOther.add(i);
            }
        }
        printList(ListDiv3);
        printList(ListDiv2);
        printList(ListOther);


    }

    private static void printList(List<Integer> list)
    {
        for (Integer aList : list) System.out.println(aList);
    }


}
