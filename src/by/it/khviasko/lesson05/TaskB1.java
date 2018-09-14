package by.it.khviasko.lesson05;
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
        list.add("Маша");
        list.add("Петя");
        list.add("Вася");
        list.add("Ира");
        list.add("Оля");
        System.out.println(list.size());
        for (int i=0; i<=4;i++)
        System.out.println (list.get(i));



    }

}
