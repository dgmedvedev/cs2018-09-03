package Lesson1;

public class Task1_1 {
    public static void main(String[] args) {
        String str = "С Новым 2019 годом!";
        String str1 = "";
        String str2 = "";

        System.out.println(str.length());

        for (int i = 0; i < str.length() / 2; i++) {
            char ch = str.charAt(i);
            str1 += ch;
        }
        for (int i = str.length() / 2; i < str.length(); i++) {
            char ch = str.charAt(i);
            str2 += ch;
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}