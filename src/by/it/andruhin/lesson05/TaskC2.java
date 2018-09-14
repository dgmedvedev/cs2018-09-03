package by.it.andruhin.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2
{
    private static int[] doSort(int[] MyArrSORT, int start, int end)
    {
        if (start >= end)
            return MyArrSORT;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j)
        {
            while (i < cur && (MyArrSORT[i] <= MyArrSORT[cur]))
            {
                i++;
            }
            while (j > cur && (MyArrSORT[cur] <= MyArrSORT[j]))
            {
                j--;
            }
            if (i < j)
            {
                int temp = MyArrSORT[i];
                MyArrSORT[i] = MyArrSORT[j];
                MyArrSORT[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        MyArrSORT = doSort(MyArrSORT, start, cur);
        MyArrSORT = doSort(MyArrSORT, cur + 1, end);
        return MyArrSORT;
    }




    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int ArrSize = 20;
        int[] MyArr = new int[ArrSize];

        for (int i = 0; i < ArrSize; i++)
        {
            MyArr[i] = sc.nextInt();
        }

        MyArr = doSort(MyArr,0, ArrSize - 1);



        for (int i = 19; i >= 0; i--)
        {
            System.out.println(MyArr[i] + " ");
        }
    }
}


