package project;

import project.category.Category;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public abstract class JoinLists {
    private static LinkedList<Category> categoryList = new LinkedList<>();

    public static void choiceCategory(List<Category> list_1, List<Category> list_2) {
        if (list_1.get(0).getIdCategory() == list_2.get(0).getIdCategory()) {
            System.out.println("Найдено совпадение по idCategory");
            System.out.println("Введите номер категории, которую хотите оставить:");
            System.out.println("1. " + "\"" + list_1.get(0).getTitle() + "\"" + " из списка 1;");
            System.out.println("2. " + "\"" + list_2.get(0).getTitle() + "\"" + " из списка 2.");
            int number = 0;
            boolean temp = true;
            while (temp) {
                try {
                    Scanner sc = new Scanner(System.in);
                    number = sc.nextInt();
                    if (number == 1 || number == 2) {
                        temp = false;
                        break;
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Будьте внимательнее!");
                }
                System.out.println("Введено неверное значение! Введите 1 или 2");
            }

            if (number == 1) {
                categoryList.add(list_1.get(0));
                System.out.println("\n" + "Выполнено успешно.");
            }

            if (number == 2) {
                categoryList.add(list_2.get(0));
                System.out.println("\n" + "Выполнено успешно.");
            }
        }
    }

    public static LinkedList<Category> getCategoryList() {
        return categoryList;
    }
}