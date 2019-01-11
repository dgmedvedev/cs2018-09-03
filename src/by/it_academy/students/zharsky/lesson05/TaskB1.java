package by.it_academy.students.zharsky.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args)
    {
        ArrayList <String> arr= new ArrayList<String>();
        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("four");
        arr.add("five");
        System.out.println(arr.size());
        for(String s : arr)
        {
            System.out.println(s);
        }
    }

}
