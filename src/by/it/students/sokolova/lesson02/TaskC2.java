package by.it.students.sokolova.lesson02;

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
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int Sum;
        Sum = i + n;
        System.out.println("DEC:" + i + "+" + n + "=" + Sum);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(n) + "=" + Integer.toBinaryString(Sum));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(n) + "=" + Integer.toHexString(Sum));
        System.out.println("OCT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(n) + "=" + Integer.toOctalString(Sum));
    }
}
