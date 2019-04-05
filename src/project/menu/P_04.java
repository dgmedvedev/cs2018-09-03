package project.menu;

import project.JoinLists;
import project.category.Category;
import project.json.JsonSave;
import project.tasks.Task;
import java.util.LinkedList;
import java.util.Scanner;

public class P_04 extends Menu{
    public static void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Какую запись Вы хотите изменить?" + "\n" +
                "1. Категорию;" + "\n" +
                "2. Задачу.");

        int number = P_04.menuSelection2();

        if (number == 1) {
            System.out.println("Введите id категории, которую хотите изменить:");
            boolean duplicate = false;
            try {
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        System.out.println("Выберите, что Вы хотите изменить:\n" +
                                "1. Название категории;\n" +
                                "2. Цвет категории;\n");
                        number = P_04.menuSelection2();
                        if (number == 1) {
                            System.out.println("Введите новое название для категории \"" + category.getTitle() + "\":");
                            String title = sc.next();
                            category.setTitle(title);
                            System.out.println("Название категории успешно изменено.");
                            JsonSave.saveFile("JoinLists", JoinLists.getCategoryList());
                            return;
                        }
                        if (number == 2) {
                            System.out.println("Введите новый цвет для категории: \"" + category.getTitle() + "\":");
                            String color = sc.next();
                            category.setColor(color);
                            System.out.println("Цвет категории успешно изменен.");
                            JsonSave.saveFile("JoinLists", JoinLists.getCategoryList());
                            return;
                        }
                        duplicate = true;
                        break;
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Будьте внимательнее. Вводите только числа!");
            }

            if (!duplicate) System.out.println("Категории с таким id не существует!");
        }

        if (number == 2) {

            System.out.println("Введите id категории для изменения задачи:");
            boolean duplicate = false;
            try {
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        System.out.println("Выберите, какую задачу Вы хотите изменить:\n" +
                                "1. Обязательную;\n" +
                                "2. Временную;\n" +
                                "3. Каждодневную;\n");
                        number = P_04.menuSelection3();
                        if (number == 1) {
                            System.out.println("Введите id обязательной задачи, для изменения:");
                            changeTask(sc,category.getRequiredTaskList());
                        }
                        if (number == 2) {
                            System.out.println("Введите id временной задачи, для изменения:");
                            changeTask(sc,category.getTemporaryTaskList());
                        }
                        if (number == 3) {
                            System.out.println("Введите id каждодневной задачи, для изменения:");
                            changeTask(sc,category.getEverydayTaskList());
                        }

                        duplicate = true;
                        break;
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Будьте внимательнее. Вводите только числа!");
            }

            if (!duplicate) System.out.println("Категории с таким id не существует!");
        }
    }

    private static void changeTask(Scanner sc, LinkedList<Task> list){

        boolean duplicateTask = false;
        try {
            String idTask = sc.nextLine();
            for (Task task : list) {
                if (task.getId() == Integer.parseInt(idTask)) {
                    System.out.println("Выберите, что Вы хотите изменить:\n" +
                            "1. Название задачи;\n" +
                            "2. Описание задачи;\n" +
                            "3. Рейтинг задачи;\n");
                    int number = P_04.menuSelection3();
                    if (number == 1) {
                        System.out.println("Введите новое название задачи:");
                        String titleTask = sc.nextLine();
                        task.setTitleTask(titleTask);
                        System.out.println("Название задачи изменено.");
                        JsonSave.saveFile("JoinLists", JoinLists.getCategoryList());
                        return;
                    }
                    if (number == 2) {
                        System.out.println("Введите новое описание задачи:");
                        String description = sc.nextLine();
                        task.setDescription(description);
                        System.out.println("Описание задачи изменено.");
                        JsonSave.saveFile("JoinLists", JoinLists.getCategoryList());
                        return;
                    }
                    if (number == 3) {
                        System.out.println("Введите новый рейтинг задачи:");
                        int rating = P_04.rating();
                        task.setRating(rating);
                        System.out.println("Рейтинг задачи изменен.");
                        JsonSave.saveFile("JoinLists", JoinLists.getCategoryList());
                        return;
                    }
                    duplicateTask = true;
                    break;
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Будьте внимательнее. Вводите только числа!");
        }

        if (!duplicateTask) System.out.println("Задачи с таким id не существует!");
    }
}