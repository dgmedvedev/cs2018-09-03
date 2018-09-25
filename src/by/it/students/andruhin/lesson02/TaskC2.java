package by.it.students.andruhin.lesson02;

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
class TaskC2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int IntFirst = sc.nextInt();
        int IntSecond = sc.nextInt();

        System.out.println("DEC:" + IntFirst + "+" + IntSecond + "=" + (IntFirst + IntSecond));

        String BinFirst = Integer.toBinaryString(IntFirst);
        String BinSecond = Integer.toBinaryString(IntSecond);
        String BinSum = Integer.toBinaryString(IntFirst + IntSecond);
        System.out.println("BIN:" + BinFirst + "+" +  BinSecond + "=" + BinSum);

        String HexFirst = Integer.toHexString(IntFirst);
        String HexSecond = Integer.toHexString(IntSecond);
        String HexSum = Integer.toHexString(IntFirst + IntSecond);
        System.out.println("HEX:" + HexFirst + "+" +  HexSecond + "=" + HexSum);

        String OctFirst = Integer.toOctalString(IntFirst);
        String OctSecond = Integer.toOctalString(IntSecond);
        String OctSum = Integer.toOctalString(IntFirst + IntSecond);
        System.out.println("OCT:" + OctFirst + "+" +  OctSecond + "=" + OctSum);
    }
}
