package lesson10.task10_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10_2 {
    public static void start() {

        int random;

        Scanner sc = new Scanner(System.in);
        ArrayList<Person> manList = new ArrayList<>();
        ArrayList<Person> womanList = new ArrayList<>();

        manList.add(new Person("Иванов", "Иван", "Иванович"));
        manList.add(new Person("Петров", "Петр", "Петрович"));
        manList.add(new Person("Сидоров", "Сидр", "Сидорович"));

        womanList.add(new Person("Иванова", "Иванна", "Ивановна"));
        womanList.add(new Person("Петрова", "Петра", "Петровна"));
        womanList.add(new Person("Сидорова", "Сидра", "Сидоровна"));

        Map<String, ArrayList<Person>> hashMap = new HashMap<>();
        hashMap.put("man", manList);
        hashMap.put("woman", womanList);

        System.out.println("Какое ФИО Вы хотите вывести в консоль?\n" +
                "(если мужское - введите m, если женское - w)");
        String answer = sc.next();

        switch (answer) {
            case "m":
                random = (int) (Math.random() * manList.size());
                System.out.println((hashMap.get("man").get(random).toString()));
                break;
            case "w":
                random = (int) (Math.random() * womanList.size());
                System.out.println((hashMap.get("woman").get(random).toString()));
                break;
            default:
                System.out.println("Введено неверное значение");
        }
    }
}
