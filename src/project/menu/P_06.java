package project.menu;

import project.JoinLists;
import project.category.Category;

import java.util.Scanner;

public class P_06 extends Menu {
    public static void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Что Вы хотите найти?" + "\n" +
                "1. Категорию;" + "\n" +
                "2. Задачу.");

        int number = P_06.menuSelection2();

        if (number == 1) {
            System.out.println("Найти категорию:" + "\n" +
                    "1. По id;" + "\n" +
                    "2. По названию;" + "\n" +
                    "3. По цвету.");
            number = P_06.menuSelection3();
            if (number == 1) {
                P_06.categorySearchByID();
            }
            if (number == 2) {
                System.out.println("Введите название категории:");
                boolean duplicate = false;

                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getTitle().equals(id)) {
                        System.out.println(category);
                        duplicate = true;
                    }
                }
                if (!duplicate) System.out.println("Категории с таким названием не существует");
            }
            if (number == 3) {
                System.out.println("Введите цвет категории:");
                boolean duplicate = false;

                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getColor().equals(id)) {
                        System.out.println(category);
                        duplicate = true;
                    }
                }
                if (!duplicate) System.out.println("Категории с таким цветом не существует");
            }

            return;
        }

        if (number == 2) {
            System.out.println("касяк");
        }
    }
}