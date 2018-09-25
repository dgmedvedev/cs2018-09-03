package by.it.students.shilo.lesson02;

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

import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int i = sc.nextInt();
        int a = sc.nextInt();
        int sum = i + a;
        System.out.println("DEC" + ":" + i + "+" + a + "=" + sum);
        System.out.println("BIN" + ":" + String.format("%6s", Integer.toBinaryString(i)).replace(' ', '0') + "+" + String.format("%6s", Integer.toBinaryString(a)).replace(' ', '0') + "=" + String.format("%6s", Integer.toBinaryString(sum)).replace(' ', '0'));
        System.out.println("HEX" + ":" + i + "+" + a + "=" + sum);
        System.out.println("OCT" + ":" + i + "+" + a + "=" + sum);
    }
}