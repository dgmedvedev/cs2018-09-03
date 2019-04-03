package project.menu;

import project.JoinLists;
import project.category.Category;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P_01 {
    public static void start() {
        System.out.println("1. Посмотреть информацию по категориям;" + "\n" +
                "2. Посмотреть информацию по всем задачам всех категорий;" + "\n" +
                "3. Посмотреть информацию по всем задачам выбранной категории.");
        int number = 0;
        boolean tempBool = true;
        while (tempBool) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2 || number == 3) {
                    tempBool = false;
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Будьте внимательнее!");
            }
            System.out.println("Введено неверное значение! Введите 1, 2 или 3");
        }

        if (number == 1) {
            for (Category category : JoinLists.getCategoryList())
                System.out.println(category);
        }

        if (number == 2) {
            for (Category category : JoinLists.getCategoryList()) {
                System.out.println(category.toStringCategories());
            }
        }

        if (number == 3) {
            System.out.println("Введите id категории");
            boolean duplicate = false;
            try {
                Scanner sc = new Scanner(System.in);
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        System.out.println(category.toStringCategories());
                        duplicate = true;
                        break;
                    }
                }
            }catch (NumberFormatException nfe){
                System.out.println("Будьте внимательнее. Вводите только числа!");
            }

            if (!duplicate) System.out.println("Категории с таким id не существует");
        }
    }
}
