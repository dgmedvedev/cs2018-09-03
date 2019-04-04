package project.menu;

import project.JoinLists;
import project.category.Category;
import project.tasks.Task;

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

            System.out.println("Найти задачу:" + "\n" +
                    "1. По id;" + "\n" +
                    "2. По названию;" + "\n" +
                    "3. По рейтингу;" + "\n" +
                    "4. По подкатегории.");
            number = P_06.menuSelection4();
            if (number == 1) {
                System.out.println("Введите id задачи:");
                boolean duplicate = false;
                try {
                    String id = sc.nextLine();
                    for (Category category : JoinLists.getCategoryList()) {
                        for (Task task : category.getRequiredTaskList())
                            if (task.getId() == Integer.parseInt(id)) {
                                System.out.println(task);
                                duplicate = true;
                            }
                        for (Task task : category.getTemporaryTaskList())
                            if (task.getId() == Integer.parseInt(id)) {
                                System.out.println(task);
                                duplicate = true;
                            }
                        for (Task task : category.getEverydayTaskList())
                            if (task.getId() == Integer.parseInt(id)) {
                                System.out.println(task);
                                duplicate = true;
                            }
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Будьте внимательнее. Вводите только числа!");
                }

                if (!duplicate) System.out.println("Задачи с таким id не существует");
            }
            if (number == 2) {
                System.out.println("Введите название задачи:");
                boolean duplicate = false;
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    for (Task task : category.getRequiredTaskList())
                        if (task.getTitleTask().equals(id)) {
                            System.out.println(task);
                            duplicate = true;
                        }
                    for (Task task : category.getTemporaryTaskList())
                        if (task.getTitleTask().equals(id)) {
                            System.out.println(task);
                            duplicate = true;
                        }
                    for (Task task : category.getEverydayTaskList())
                        if (task.getTitleTask().equals(id)) {
                            System.out.println(task);
                            duplicate = true;
                        }
                }
                if (!duplicate) System.out.println("Задачи с таким названием не существует");
            }
            if (number == 3) {
                System.out.println("Введите рейтинг задачи:");
                int rating = P_06.rating();
                boolean duplicate = false;
                for (Category category : JoinLists.getCategoryList()) {
                    for (Task task : category.getRequiredTaskList())
                        if (task.getRating()==rating) {
                            System.out.println(task);
                            duplicate = true;
                        }
                    for (Task task : category.getTemporaryTaskList())
                        if (task.getRating()==rating) {
                            System.out.println(task);
                            duplicate = true;
                        }
                    for (Task task : category.getEverydayTaskList())
                        if (task.getRating()==rating) {
                            System.out.println(task);
                            duplicate = true;
                        }
                }
                if (!duplicate) System.out.println("Задачи с таким рейтингом не существует");

            }
            if (number == 4) {
                System.out.println("Введите подкатегорию задачи:");
                boolean duplicate = false;
                String subcategory = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    for (Task task : category.getRequiredTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            System.out.println(task);
                            duplicate = true;
                        }
                    for (Task task : category.getTemporaryTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            System.out.println(task);
                            duplicate = true;
                        }
                }
                if (!duplicate) System.out.println("Задачи с такой подкатегорией не существует");
            }
        }
    }
}