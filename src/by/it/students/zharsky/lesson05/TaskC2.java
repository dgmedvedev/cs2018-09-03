package by.it.students.zharsky.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) throws Exception
    {
        //17 8 31 13 45 47 5 25 36 44 39 38 16 49 5 34 16 45 36 13
        //Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[20];
        for(int i = 0; i<arr.length; i++)
        {
            int added = scan.nextInt();
            arr[i] = added;
        }
        //for(int i : arr)
       //{System.out.print(i+" ");}
        //System.out.println("\n");
        sort(arr);

    }



    public static void sort(int[] sorting)
    {
        int maxi = sorting.length-1;
        for(int j = 0; j<sorting.length; j++)
        {
            for(int i = 0; i<maxi; i++)
            {
                if(sorting[i]<sorting[i+1])
                {
                    int temp = sorting[i];
                    sorting[i]=sorting[i+1];
                    sorting[i+1]=temp;
                }
            }
//            maxi--;
        }
        for(int n : sorting)
        {
            System.out.println(n);
        }
    }

}
