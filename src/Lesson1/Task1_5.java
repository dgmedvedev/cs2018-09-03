package Lesson1;

public class Task1_5 {
    public static void main(String[] args) {
        String str = "Имеется строка? которая# содержит# символы# ? и # символы ?.";
        String newStr = str.replace("?", "HELLO");
        String finalStr = newStr.replace("#", "");
        System.out.println(finalStr);

    }
}