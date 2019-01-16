package by.it1.decisions_9h37m53s.lesson04_2h12m25s;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int sumDayMonth=0;

        Integer[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month-1; i++) {

            sumDayMonth += year[i];
        }
        int numberDayYear = day+sumDayMonth;
        System.out.println(numberDayYear);
    }

}
