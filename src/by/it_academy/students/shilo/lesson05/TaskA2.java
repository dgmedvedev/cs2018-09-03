package by.it_academy.students.shilo.lesson05;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/

import java.util.Scanner;
import java.util.ArrayList;

public class TaskA2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.next();
            if (line.equals("END"))
                break;
            list.add(line);
        }
        System.out.println(list);
    }
}
