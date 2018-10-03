package by.it.medvedev.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("первая строка");
        list.add("вторая строка");
        list.add("третья строка");
        list.add("четвертая строка");
        list.add("пятая строка");

        int a = list.size();
        System.out.println(a);

        for (String s : list)
            System.out.println(s);
    }
}


