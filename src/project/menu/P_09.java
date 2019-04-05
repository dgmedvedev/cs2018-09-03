package project.menu;

import project.JoinLists;
import project.category.Category;
import project.tasks.Task;

import java.util.Scanner;

public class P_09 extends Menu {
    public static void start() {
        System.out.println("1. Для выбранной категории;\n" +
                "2. Для всех категорий вместе.");

        int number = P_09.menuSelection2();

        if (number == 1) {


            System.out.println("Введите id категории:");
            boolean duplicate = false;
            try {
                Scanner sc = new Scanner(System.in);
                String id = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    if (category.getIdCategory() == Integer.parseInt(id)) {
                        System.out.println("Вывести для выбранной категории:\n" +
                                "1. Среднюю сложность;\n" +
                                "2. Суммарную сложность;\n" +
                                "3. Среднюю сложность по подкатегориям;\n" +
                                "4. Суммарную сложность по подкатегориям;\n" +
                                "5. Количество задач по подкатегориям.");
                        number = P_09.menuSelection5();
                        int sum;
                        double count;
                        if (number == 1) {
                            sum = sumRating(category);
                            count = countTasks(category);
                            System.out.print("Средняя сложность, для категории "
                                    + category.getIdCategory() + " = ");
                            System.out.printf("%.1f", sum / count);
                            System.out.println();
                        }
                        if (number == 2) {
                            sum = sumRating(category);
                            System.out.println("Суммарная сложность, для категории "
                                    + category.getIdCategory() + " = " + sum);
                        }
                        if (number == 3) {
                            System.out.println("Введите подкатегорию задачи:");
                            boolean temp = false;
                            String subcategory = sc.nextLine();
                            for (Task task : category.getRequiredTaskList())
                                if (task.getSubcategory().equals(subcategory)) {
                                    sum = sumRating(category, subcategory);
                                    count = countTasks(category, subcategory);
                                    System.out.print("Средняя сложность, для подкатегории "
                                            + subcategory + " = ");
                                    System.out.printf("%.1f", sum / count);
                                    System.out.println();
                                    return;
                                }
                            for (Task task : category.getTemporaryTaskList())
                                if (task.getSubcategory().equals(subcategory)) {
                                    sum = sumRating(category, subcategory);
                                    count = countTasks(category, subcategory);
                                    System.out.print("Средняя сложность, для подкатегории "
                                            + subcategory + " = ");
                                    System.out.printf("%.1f", sum / count);
                                    System.out.println();
                                    temp = true;
                                    break;
                                }
                            if (!temp) System.out.println("Задачи с такой подкатегорией не существует");
                        }
                        if (number == 4) {
                            System.out.println("Введите подкатегорию задачи:");
                            boolean temp = false;
                            String subcategory = sc.nextLine();
                            for (Task task : category.getRequiredTaskList())
                                if (task.getSubcategory().equals(subcategory)) {
                                    sum = sumRating(category, subcategory);
                                    System.out.println("Суммарная сложность, для подкатегории "
                                            + subcategory + " = " + sum);
                                    return;
                                }
                            for (Task task : category.getTemporaryTaskList())
                                if (task.getSubcategory().equals(subcategory)) {
                                    sum = sumRating(category, subcategory);
                                    System.out.println("Суммарная сложность, для подкатегории "
                                            + subcategory + " = " + sum);
                                    temp = true;
                                    break;
                                }
                            if (!temp) System.out.println("Задачи с такой подкатегорией не существует");
                        }
                        if (number == 5) {
                            System.out.println("Введите подкатегорию задачи:");
                            boolean temp = false;
                            String subcategory = sc.nextLine();
                            for (Task task : category.getRequiredTaskList())
                                if (task.getSubcategory().equals(subcategory)) {
                                    count = countTasks(category, subcategory);
                                    System.out.println("Количество задач, для подкатегории "
                                            + subcategory + " = " + count);
                                    return;
                                }
                            for (Task task : category.getTemporaryTaskList())
                                if (task.getSubcategory().equals(subcategory)) {
                                    count = countTasks(category, subcategory);
                                    System.out.println("Количество задач, для подкатегории "
                                            + subcategory + " = " + count);
                                    temp = true;
                                    break;
                                }
                            if (!temp) System.out.println("Задачи с такой подкатегорией не существует");

                        }

                        duplicate = true;
                        break;
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Будьте внимательнее. Вводите только числа!");
            }

            if (!duplicate) System.out.println("Категории с таким id не существует");
            return;
        }

        if (number == 2) {
            System.out.println("Вывести для всех категорий:\n" +
                    "1. Среднюю сложность;\n" +
                    "2. Суммарную сложность;\n" +
                    "3. Среднюю сложность по подкатегориям;\n" +
                    "4. Суммарную сложность по подкатегориям;\n" +
                    "5. Количество задач по подкатегориям.");
            number = P_09.menuSelection5();
            int sum;
            double count;

            if (number == 1) {
                sum = sumRatingAll();
                count = countTasksAll();
                System.out.print("Средняя сложность, для всех категорий " + " = ");
                System.out.printf("%.1f", sum / count);
                System.out.println();
            }
            if (number == 2) {
                sum = sumRatingAll();
                System.out.println("Суммарная сложность, для всех категорий " +
                        " = " + sum);
            }
            if (number == 3) {
                System.out.println("Введите подкатегорию задачи:");
                boolean temp = false;
                Scanner sc = new Scanner(System.in);
                String subcategory = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    for (Task task : category.getRequiredTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            sum = sumRatingAll(subcategory);
                            count = countTasksAll(subcategory);
                            System.out.print("Средняя сложность, для подкатегорий "
                                    + subcategory + " = ");
                            System.out.printf("%.1f", sum / count);
                            System.out.println();
                            return;
                        }
                    for (Task task : category.getTemporaryTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            sum = sumRatingAll(subcategory);
                            count = countTasksAll(subcategory);
                            System.out.print("Средняя сложность, для подкатегорий "
                                    + subcategory + " = ");
                            System.out.printf("%.1f", sum / count);
                            System.out.println();
                            temp = true;
                            break;
                        }
                }
                if (!temp) System.out.println("Задачи с такой подкатегорией не существует");
            }
            if (number == 4) {
                System.out.println("Введите подкатегорию задачи:");
                boolean temp = false;
                Scanner sc = new Scanner(System.in);
                String subcategory = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    for (Task task : category.getRequiredTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            sum = sumRatingAll(subcategory);
                            System.out.println("Суммарная сложность, для подкатегорий "
                                    + subcategory + " = " + sum);
                            return;
                        }
                    for (Task task : category.getTemporaryTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            sum = sumRatingAll(subcategory);
                            System.out.println("Суммарная сложность, для подкатегорий "
                                    + subcategory + " = " + sum);
                            temp = true;
                            break;
                        }
                }
                if (!temp) System.out.println("Задачи с такой подкатегорией не существует");

            }
            if (number == 5) {
                System.out.println("Введите подкатегорию задачи:");
                boolean temp = false;
                Scanner sc = new Scanner(System.in);
                String subcategory = sc.nextLine();
                for (Category category : JoinLists.getCategoryList()) {
                    for (Task task : category.getRequiredTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            count = countTasksAll(subcategory);
                            System.out.println("Количество задач, для подкатегорий "
                                    + subcategory + " = " + count);
                            return;
                        }
                    for (Task task : category.getTemporaryTaskList())
                        if (task.getSubcategory().equals(subcategory)) {
                            count = countTasksAll(subcategory);
                            System.out.println("Количество задач, для подкатегорий "
                                    + subcategory + " = " + count);
                            temp = true;
                            break;
                        }
                }
                if (!temp) System.out.println("Задачи с такой подкатегорией не существует");
            }
        }
    }

    private static int sumRatingAll() {
        int sum = 0;
        for (Category category : JoinLists.getCategoryList()) {
            for (Task task : category.getRequiredTaskList()) {
                sum += task.getRating();
            }
            for (Task task : category.getTemporaryTaskList()) {
                sum += task.getRating();
            }
            for (Task task : category.getEverydayTaskList()) {
                sum += task.getRating();
            }
        }
        return sum;
    }

    private static int sumRatingAll(String subcategory) {
        int sum = 0;
        for (Category category : JoinLists.getCategoryList()) {
            for (Task task : category.getRequiredTaskList()) {
                if (task.getSubcategory().equals(subcategory))
                    sum += task.getRating();
            }
            for (Task task : category.getTemporaryTaskList()) {
                if (task.getSubcategory().equals(subcategory))
                    sum += task.getRating();
            }
            for (Task task : category.getEverydayTaskList()) {
                if (task.getSubcategory().equals(subcategory))
                    sum += task.getRating();
            }
        }
        return sum;
    }

    private static int sumRating(Category category) {
        int sum = 0;
        for (Task task : category.getRequiredTaskList()) {
            sum += task.getRating();
        }
        for (Task task : category.getTemporaryTaskList()) {
            sum += task.getRating();
        }
        for (Task task : category.getEverydayTaskList()) {
            sum += task.getRating();
        }
        return sum;
    }

    private static int sumRating(Category category, String subcategory) {
        int sum = 0;
        for (Task task : category.getRequiredTaskList()) {
            if (task.getSubcategory().equals(subcategory))
                sum += task.getRating();
        }
        for (Task task : category.getTemporaryTaskList()) {
            if (task.getSubcategory().equals(subcategory))
                sum += task.getRating();
        }
        return sum;
    }

    private static double countTasksAll() {
        double count = 0;
        for (Category category : JoinLists.getCategoryList()) {
            for (Task ignored : category.getRequiredTaskList()) {
                count++;
            }
            for (Task ignored : category.getTemporaryTaskList()) {
                count++;
            }
            for (Task ignored : category.getEverydayTaskList()) {
                count++;
            }
        }
        return count;
    }

    private static double countTasksAll(String subcategory) {
        double count = 0;
        for (Category category : JoinLists.getCategoryList()) {
            for (Task task : category.getRequiredTaskList()) {
                if (task.getSubcategory().equals(subcategory))
                    count++;
            }
            for (Task task : category.getTemporaryTaskList()) {
                if (task.getSubcategory().equals(subcategory))
                    count++;
            }
            for (Task task : category.getEverydayTaskList()) {
                if (task.getSubcategory().equals(subcategory))
                    count++;
            }
        }
        return count;
    }

    private static double countTasks(Category category) {
        double count = 0;
        for (Task ignored : category.getRequiredTaskList()) {
            count++;
        }
        for (Task ignored : category.getTemporaryTaskList()) {
            count++;
        }
        for (Task ignored : category.getEverydayTaskList()) {
            count++;
        }
        return count;
    }

    private static double countTasks(Category category, String subcategory) {
        double count = 0;
        for (Task task : category.getRequiredTaskList()) {
            if (task.getSubcategory().equals(subcategory))
                count++;
        }
        for (Task task : category.getTemporaryTaskList()) {
            if (task.getSubcategory().equals(subcategory))
                count++;
        }
        return count;
    }
}