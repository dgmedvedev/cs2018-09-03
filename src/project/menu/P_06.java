package project.menu;

import project.JoinLists;
import project.category.Category;

import java.util.Scanner;

public class P_06 extends Menu{
    public static void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Что Вы хотите найти?" + "\n" +
                "1. Категорию;" + "\n" +
                "2. Задачу.");

        int number = P_06.menuSelection2();

        if (number == 1) {
            System.out.println("Найти категорию:" + "\n" +
                    "1. По названию или цвету;" + "\n" +
                    "2. По id.");
            number = P_06.menuSelection2();

            System.out.println("number = " + number);
        }

        if (number == 2) {
            System.out.println("касяк");
        }
    }
}