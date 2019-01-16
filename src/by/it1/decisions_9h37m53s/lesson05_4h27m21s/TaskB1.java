package by.it1.decisions_9h37m53s.lesson05_4h27m21s;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String>myList = new ArrayList<>();
        myList.add("String 1");
        myList.add("String 2");
        myList.add("String 3");
        myList.add("String 4");
        myList.add("String 5");
        System.out.println(myList.size());
        for (String myString:myList){
            System.out.println(myString);
        }
    }
}
