package by.it.medvedev.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/


import java.util.Scanner;

public class TaskA1my {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        int [] m = {a,b,c,d,e,f,g,h,k,l};
        for (i=0;i<10;i++){
            m[i]=9-i;
        }
        for (i=0;i<10;i++){
            System.out.println(m[i]);
        }
    }

}
