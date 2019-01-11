package by.it_academy.students.ilnitskaya.lesson02;

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
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k = i + j;
        System.out.println("DEC:" + i + "+" + j + "=" + k);
        String b1 = Integer.toBinaryString (i);
        String b2 = Integer.toBinaryString (j);
        String b3 = Integer.toBinaryString (k);
        System.out.println("BIN:" + b1 + "+" + b2 + "=" + b3);
        String h1 = Integer.toHexString (i);
        String h2 = Integer.toHexString (j);
        String h3 = Integer.toHexString (k);
        System.out.println("HEX:" + h1 + "+" + h2 + "=" + h3);
        String o1 = Integer.toOctalString (i);
        String o2 = Integer.toOctalString (j);
        String o3 = Integer.toOctalString (k);
        System.out.println("OCT:" + o1 + "+" + o2 + "=" + o3);

    }
}
