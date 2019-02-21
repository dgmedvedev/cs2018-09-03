package class_work.lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Task10_1 {

    public static void start() {
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();


        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число - текст (10 раз)");
            int number = sc.nextInt();
            String string = sc.next();

            if (hashMap.containsKey(number)) {
                String value = hashMap.get(number);
                if (string.equals(value)) System.out.println("Попытка создать дубликат");
                else {
                    hashMap.put(number, string);
                    System.out.println("Значение " + value + " перезаписано значением " + string);
                }
            } else {
                hashMap.put(number, string);
                System.out.println("Успешно добавлено новое значение");
            }
        }

        for (Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(sc.nextInt());
        for (int i = 0; i < 4; i++) {
            int value = sc.nextInt();

            hashSet.add(value);

        }
        for (Integer i : hashSet)
            System.out.print(i + " ");
        System.out.println();

        while (isTrue) {
            System.out.println("Введите значение ключа для поиска");
            int key = sc.nextInt();

            if (hashMap.containsKey(key)) {
                System.out.println(key + " - " + hashMap.get(key));
                isTrue = false;
            } else System.out.println("такого ключа нет");

        }
    }
}