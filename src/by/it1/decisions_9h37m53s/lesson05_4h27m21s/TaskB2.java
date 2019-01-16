package by.it1.decisions_9h37m53s.lesson05_4h27m21s;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] myMas = new Integer[20];
        int lenghtMasA = myMas.length/2;
        int lenghtMasB = myMas.length-lenghtMasA;
        Integer[]a = new Integer[lenghtMasA];
        Integer[]b = new Integer[lenghtMasB];
        for (int i = 0; i < myMas.length; i++) {
            myMas[i] = sc.nextInt();
        }
        for(int i=0;i<lenghtMasA;i++){
            a[i]=myMas[i];
        }
        for (int j =0;j<lenghtMasB;j++){
            b[j]=myMas[lenghtMasA+j];
        }

        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+ Arrays.toString(b));
    }

}
