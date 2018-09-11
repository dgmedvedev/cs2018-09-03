package by.it.zharsky.lesson04;

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
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int dayNum = scan.nextInt();
        int monthNum = scan.nextInt();
        int [] dayzInM = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int startMonth = 0;
        for(int i = 0; i<monthNum-1;i++)
        {
            startMonth+=dayzInM[i];
        }
        int result = startMonth + dayNum;
        System.out.println(result);
    }
}
