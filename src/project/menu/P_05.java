package project.menu;

import project.JoinLists;
import project.category.Category;
import project.tasks.Task;

import java.util.LinkedList;
import java.util.Scanner;

public class P_05 extends Menu {
    public static void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Какую запись Вы хотите удалить?" + "\n" +
                "1. Категорию;" + "\n" +
                "2. Задачу.");

        int number = P_05.menuSelection2();

        if (number == 1) {
            System.out.println("Введите id категории, которую хотите удалить:");
            boolean duplicate = false;
            try {
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        JoinLists.getCategoryList().remove(category);
                        System.out.println("Категория с id = " + category.getIdCategory() + ", успешно удалена.");
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

            System.out.println("Введите id категории для удаления задачи:");
            boolean duplicate = false;
            try {
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        System.out.println("Выберите, какую задачу Вы хотите удалить:\n" +
                                "1. Обязательную;\n" +
                                "2. Временную;\n" +
                                "3. Каждодневную;\n");
                        number = P_05.menuSelection3();
                        if (number == 1) {
                            System.out.println("Введите id обязательной задачи, для удаления:");
                            changeTask(sc, category.getRequiredTaskList());
                        }
                        if (number == 2) {
                            System.out.println("Введите id временной задачи, для удаления:");
                            changeTask(sc, category.getTemporaryTaskList());
                        }
                        if (number == 3) {
                            System.out.println("Введите id каждодневной задачи, для удаления:");
                            changeTask(sc, category.getEverydayTaskList());
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

    private static void changeTask(Scanner sc, LinkedList<Task> list) {

        boolean duplicateTask = false;
        try {
            String idTask = sc.nextLine();
            for (Task task : list) {
                if (task.getId() == Integer.parseInt(idTask)) {
                    list.remove(task);
                    System.out.println("Задача с id = " + task.getId() + ", успешно удалена.");
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