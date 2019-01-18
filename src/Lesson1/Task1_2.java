package Lesson1;

public class Task1_2 {
    public static void main(String[] args) {

        int number = (int) (Math.random()*1000);
        System.out.println("Случайное число = "+number);

        System.out.println(number % 10 == 7 ? "Последняя цифра равна 7" : "Последняя цифра не равна 7");

    }
}
