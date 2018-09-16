package by.it.andruhin.lesson04;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.util.Scanner;

public class TaskA2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int DaysOfWeekInt = sc.nextInt();
        String DaysOfWeekString;
        
        switch (DaysOfWeekInt)
        {
            case 1:  DaysOfWeekString = "понедельник";
                break;
            case 2:  DaysOfWeekString = "вторник";
                break;
            case 3:  DaysOfWeekString = "среда";
                break;
            case 4:  DaysOfWeekString = "четверг";
                break;
            case 5:  DaysOfWeekString = "пятница";
                break;
            case 6:  DaysOfWeekString = "суббота";
                break;
            case 7:  DaysOfWeekString = "воскресенье";
                break;
            default: DaysOfWeekString = "такого дня недели не существует";
                break;
        }
        System.out.println(DaysOfWeekString);
    }
}
