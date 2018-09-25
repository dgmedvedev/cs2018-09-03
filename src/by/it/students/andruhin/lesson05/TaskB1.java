package by.it.students.andruhin.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> MyArrList = new ArrayList<>();
        /*for (int i = 0; i < 5; i++)
        {
            MyArrList.add(sc.nextLine());
        }*/
        MyArrList.add("q");
        MyArrList.add("w");
        MyArrList.add("e");
        MyArrList.add("r");
        MyArrList.add("t");

        System.out.println(MyArrList.size());
        for (String Str : MyArrList)
        {
            System.out.println(Str);
        }
    }

}
