package by.it.tomashevskaya.lesson02;

import java.sql.SQLOutput;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String args []) {
        System.out.print("Число а равно ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print("Число в равно ");
        int j = sc.nextInt();
        int sum = i + j;
        System.out.println("Sum = " + sum);
    }



    }






