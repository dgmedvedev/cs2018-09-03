package by.it_academy.medvedev.lesson03;
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
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
    static int sumDigitsInNumber (int abcd){
        int a = abcd/1000;
        int b = (abcd-a*1000)/100;
        int c = ((abcd-a*1000)-b*100)/10;
        int d = ((abcd-a*1000)-b*100)-c*10;
        int number = a+b+c+d;
        return number;
    }

//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
