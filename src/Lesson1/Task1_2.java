package Lesson1;

import java.util.Random;

public class Task1_2 {
    public static void main(String[] args) {

        int temp = (new Random().nextInt());

        int number;

        if (temp < 0) {
            number = temp - temp - temp;
            System.out.println("Случайное число = " + (-1 * number));
        } else {
            number = temp;
            System.out.println("Случайное число = " + number);

        }
        System.out.println(number % 10 == 7 ? "Последняя цифра равна 7" : "Последняя цифра не равна 7");
    }
}