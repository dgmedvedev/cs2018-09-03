package by.HeadFirst.Examples;

import javax.swing.text.BadLocationException;
import java.math.*;

public class Exeption {

    static void go(String s, int x) throws BadLocationException {
        System.out.println("Начало опасного метода");

        if (x > 3 && s.equals("BYE")) {
            throw new BadLocationException(s, x);
        }
        System.out.println("х меньше 4!!!");
        System.out.println("Конец опасного метода");

    }

    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        String s = "BYE";
        try {
            System.out.println("Начало try");
            go(s, x);
            System.out.println("Конец try");
        } catch (Exception be) {
            System.out.println("Жуткое исключение");
            be.printStackTrace();

        } finally {
            System.out.println("x равен " + x);
        }
        System.out.println("Конец main");
    }
}