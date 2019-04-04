package project.menu;

import project.JoinLists;
import project.category.Category;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.TemporaryTask;

import java.util.Scanner;

public class P_03 extends Menu{
    public static void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Какую запись Вы хотите создать?" + "\n" +
                "1. Новая категория;" + "\n" +
                "2. Новая задача.");

        int number = P_03.menuSelection2();

        if (number == 1) {
            System.out.println("Введите название категории:");
            String title = sc.nextLine();
            System.out.println("Введите цвет категории:");
            String color = sc.nextLine();
            JoinLists.getCategoryList().add(new Category(title, color));
        }

        if (number == 2) {

            System.out.println("Введите id категории для добавления задачи");
            boolean duplicate = false;
            try {
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        System.out.println("Выберите, какую задачу Вы хотите создать:\n" +
                                "1. Обязательную;\n" +
                                "2. Временную;\n" +
                                "3. Каждодневную;\n");
                        number = P_03.menuSelection3();
                        if (number == 1) {
                            System.out.println("Введите название задачи:");
                            String titleTask = sc.nextLine();
                            System.out.println("Введите описание задачи:");
                            String description = sc.nextLine();
                            System.out.println("Введите подкатегорию задачи:");
                            String subcategory = sc.nextLine();
                            System.out.println("Введите рейтинг задачи:");
                            int rating = P_03.rating();
                            RequiredTask newTask = new RequiredTask(titleTask, rating, subcategory);
                            newTask.setDescription(description);
                            category.getRequiredTaskList().add(newTask);
                            System.out.println("Обязательная задача создана.");
                        }
                        if (number == 2) {
                            System.out.println("Введите название задачи:");
                            String titleTask = sc.nextLine();
                            System.out.println("Введите описание задачи:");
                            String description = sc.nextLine();
                            System.out.println("Введите подкатегорию задачи:");
                            String subcategory = sc.nextLine();
                            System.out.println("Введите срок на выполнение задачи:");
                            String deadline = sc.nextLine();
                            System.out.println("Введите рейтинг задачи:");
                            int rating = P_03.rating();
                            TemporaryTask newTask = new TemporaryTask(titleTask, rating, subcategory, deadline);
                            newTask.setDescription(description);
                            category.getTemporaryTaskList().add(newTask);
                            System.out.println("Временная задача создана.");
                        }
                        if (number == 3) {
                            System.out.println("Введите название задачи:");
                            String titleTask = sc.nextLine();
                            System.out.println("Введите описание задачи:");
                            String description = sc.nextLine();
                            System.out.println("Введите рейтинг задачи:");
                            int rating = P_03.rating();
                            EverydayTask newTask = new EverydayTask(titleTask, rating);
                            newTask.setDescription(description);
                            category.getEverydayTaskList().add(newTask);
                            System.out.println("Каждодневная задача создана.");
                        }

                        duplicate = true;
                        break;
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Будьте внимательнее. Вводите только числа!");
            }

            if (!duplicate) System.out.println("Категории с таким id не существует");

        }

    }


}