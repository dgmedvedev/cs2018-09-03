package by.it1.medvedev3.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = i + j;
        System.out.println
                ("DEC:" + i + "+" + j + "=" + k);
        System.out.println
                ("BIN:" + Integer.toString(i, 2) + "+" + Integer.toString(j, 2) + "=" + Integer.toString(k, 2));
        System.out.println
                ("HEX:" + Integer.toString(i, 16) + "+" + Integer.toString(j, 16) + "=" + Integer.toString(k, 16));
        System.out.println
                ("OCT:" + Integer.toString(i, 8) + "+" + Integer.toString(j, 8) + "=" + Integer.toString(k, 8));

    }
}
