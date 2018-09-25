package by.it.students.sokolova.lesson03;
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
    public static int sumDigitsInNumber(int number) {
        String s = Integer.toString(number);
        char [] chars = s.toCharArray();
        int i1 = Character.getNumericValue(chars[0]);
        int i2 = Character.getNumericValue(chars[1]);
        int i3 = Character.getNumericValue(chars[2]);
        int i4 = Character.getNumericValue(chars[3]);
        int sum = i1+i2+i3+i4;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
}
