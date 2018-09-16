package by.it.medvedev.lesson02;

import javafx.util.converter.IntegerStringConverter;

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
// Сумма чисел в ДЕСЯТИЧНОМ виде
        System.out.println("DEC:" + i + "+" + j + "=" + k);
// Сумма чисел в ДВОИЧНОМ виде
        System.out.print("BIN:");
        System.out.print(Integer.toString(i, 2));
        System.out.print("+");
        System.out.print(Integer.toString(j, 2));
        System.out.print("=");
        System.out.println(Integer.toString(k, 2));
// Сумма чисел в ШЕСТНАДЦАТИРИЧНОМ виде
        System.out.print("HEX:");
        System.out.print(Integer.toString(i, 16));
        System.out.print("+");
        System.out.print(Integer.toString(j, 16));
        System.out.print("=");
        System.out.println(Integer.toString(k, 16));
// Сумма чисел в ВОСЬМИРИЧНОМ виде
        System.out.print("OCT:");
        System.out.print(Integer.toString(i, 8));
        System.out.print("+");
        System.out.print(Integer.toString(j, 8));
        System.out.print("=");
        System.out.println(Integer.toString(k, 8));
        }
    }
