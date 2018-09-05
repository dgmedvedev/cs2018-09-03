package by.it.medvedev.lesson02;

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
        int k = i+j;
        System.out.println("D"+"E"+"C"+":"+i+"+"+j+"="+k);
        System.out.println("B"+"I"+"N"+":"+i+"+"+j+"="+k);
        System.out.println("H"+"E"+"X"+":"+i+"+"+j+"="+k);
        System.out.println("O"+"C"+"T"+":"+i+"+"+j+"="+k);
    }

}
