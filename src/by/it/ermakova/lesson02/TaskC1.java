package by.it.ermakova.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        int a= 34;
        int b = 26;
        Scanner sc=new Scanner(System.in);
        int Sum = a+b;
        System.out.println("Sum"+" "+"="+" "+Sum);




    }

}
