package by.it.shilo.lesson04;

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

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число и месяц");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 12; i++) {
            for (int d = 1; d < 31; d++) {
                sum = d;
                if (day == d && i == month) break;
                System.out.print(sum);
            }
        }
    }
}
