package by.it_academy.students.zharsky.lesson05;

import java.util.ArrayList;
import java.util.Scanner;

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
public class TaskA2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        Boolean exept = false;
        String ended = "END";
        while(!exept)
        {
            String added = scan.nextLine();
            if(added.equals(ended))
            {
                exept = true;
            }
            else
            {
                arr.add(added);

            }

        }
        System.out.println(arr.toString());

    }
}

