package by.it1.medvedev3.lesson04;
/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.

Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,

Ввод:
15
Вывод:
1,3,6,10,15,

Ввод:
14
Вывод:
1,3,6,10,


 */


import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();

        int i = 2;
        int sum = 1;
        while (sum <= digit) {
            System.out.print(sum + ",");
            sum = sum + i++;

    /*    int i = 1;            //второй способ
        int sum = 0;
        for (; ; ) {
            sum = sum + i++;
            if (sum > digit) break;
            else System.out.print(sum+",");
        }
    */
        }
    }
}
