package by.it1.medvedev3.lesson03;

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
    static int sumDigitsInNumber(int number) {
        int a, b, c, d;
        a = number / 1000;
        b = (number - a * 1000) / 100;
        c = ((number - a * 1000) - b * 100) / 10;
        d = number - (1000 * a + 100 * b + 10 * c);

        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
}