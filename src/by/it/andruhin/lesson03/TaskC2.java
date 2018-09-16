package by.it.andruhin.lesson03;
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
public class TaskC2
{

    public static int sumDigitsInNumber(int number)
    {
        //return number/1000 + (number - (number/1000 * 1000))/100 + (number - (number/1000 * 1000) - ((number - (number/1000 * 1000))/100 * 100))/10 + (number - (number/1000 * 1000) - ((number - (number/1000 * 1000))/100 * 100) - ((number - (number/1000 * 1000) - ((number - (number/1000 * 1000))/100 * 100))/10 * 10));
        //Код выше полностью рабочий, но он плох, ибо не читаем и не универсален
        //Удачи тому, кто будет пытаться в нем разобраться :D

        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(sumDigitsInNumber(5467));
    }

}
