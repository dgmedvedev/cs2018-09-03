package by.it_academy.students.zharsky.lesson05;
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
//1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0
public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> unsorted = new ArrayList<Integer>();
        ArrayList<Integer> divToThree = new ArrayList<Integer>();
        ArrayList<Integer> divToTwo = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        for(int i = 0; i<20; i++)
        {
            int added = scan.nextInt();
            unsorted.add(added);
        }
        //System.out.println(unsorted.toString());
        for(int i : unsorted)
        {
            int toTwo = i%2;
            int toThree = i%3;
            if(toTwo==0) { divToTwo.add(i); }
            if(toThree==0) { divToThree.add(i); }
            if(toTwo>0&&toThree>0){others.add(i);}
        }
        printList(divToThree);
        //System.out.println("\n");
        printList(divToTwo);
        //System.out.println("\n");
        printList(others);

    }

    private static void printList(List<Integer> list)
    {
        for (Integer aList : list)
            System.out.println(aList);
    }


}
