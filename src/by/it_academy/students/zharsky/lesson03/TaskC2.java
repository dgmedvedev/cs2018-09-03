package by.it_academy.students.zharsky.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {




    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int source = scan.nextInt();
        System.out.println(sumDigitsInNumber(source));
    }

    private static int sumDigitsInNumber(int number)
    {
        int sum = 0;
        int key = 1;
        sum  = accumulator(number, key);
        return sum;
    }

    private static int accumulator(int number, int key)
    {
        int startNum = number;
        key = key * 10;
        double num = (double) number / key;
        int wholeNum =number / key;
        float rounded = (float)((num - wholeNum)*10);
        int rem = (int)rounded;
        if(rem ==0)
        {
            return 0;
        }
        else
        {
           rem+= accumulator(startNum, key);
           return rem;
        }
    }
}
