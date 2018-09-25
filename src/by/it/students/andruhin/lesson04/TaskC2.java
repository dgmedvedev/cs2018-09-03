package by.it.students.andruhin.lesson04;

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
public class TaskC2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();
        int Month = sc.nextInt();

        int DayOfYear = 0;

        int[] MyArray = {31,28,31,30,31,30,31,31,30,31,30,31};

        int i = 1;
        while(i < Month)
        {
            DayOfYear += MyArray[i - 1];
            i++;
        }
        DayOfYear += Day;
        System.out.println(DayOfYear);
    }
}
