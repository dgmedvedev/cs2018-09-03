package Lesson1;

import java.util.Random;

public class Task1_2 {
    public static void main(String[] args) {

        int number = (new Random().nextInt());
        System.out.println("Случайное число = "+number);

        System.out.println(number % 10 == 7 ? "Последняя цифра равна 7" : "Последняя цифра не равна 7");

    }
}
