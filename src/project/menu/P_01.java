package project.menu;

import project.JoinLists;
import project.category.Category;

import java.util.Scanner;

public class P_01 extends Menu{
    public static void start() {
        System.out.println("1. Посмотреть информацию по категориям;" + "\n" +
                "2. Посмотреть информацию по всем задачам всех категорий;" + "\n" +
                "3. Посмотреть информацию по всем задачам выбранной категории.");

        int number = P_01.menuSelection3();

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
            P_01.categorySearchByID();
        }
    }
}