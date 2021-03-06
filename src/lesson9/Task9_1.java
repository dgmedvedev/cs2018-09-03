package lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9_1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Вводите строки через Enter\n" +
                "Для завершения ввода введите END");
        String string = sc.nextLine();
        while (!string.equals("END")) {
            list.add(string);
            string = sc.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            String newString = list.get(i);
            if (newString.contains("a") || newString.contains("а")) {   // EN и RU "a"
                newString = newString.replaceAll("[a,а]", "");
                list.set(i, newString);
            }
        }

        for (String str : list)
            System.out.println(str);
    }
}