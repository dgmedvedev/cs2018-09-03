package by.it.students.takoy.lesson05;
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
        Scanner sc = new Scanner(System.in);
        ArrayList<String> MyArrList = new ArrayList<>();
        MyArrList.add("a");
        MyArrList.add("b");
        MyArrList.add("c");
        MyArrList.add("d");
        MyArrList.add("e");
        System.out.println(MyArrList.size());
        for (String Str : MyArrList) {
            System.out.println(Str);
        }
    }

}
