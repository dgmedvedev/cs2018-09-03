package project.menu;

import project.JoinLists;
import project.category.Category;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.Task;
import project.tasks.TemporaryTask;

import java.math.BigDecimal;
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
                        int sum = 0;
                        double count = 0;
                        if (number == 1) {
                            for (Task task : category.getRequiredTaskList()) {
                                sum += task.getRating();
                                count++;
                            }
                            for (Task task : category.getTemporaryTaskList()) {
                                sum += task.getRating();
                                count++;
                            }
                            for (Task task : category.getEverydayTaskList()) {
                                sum += task.getRating();
                                count++;
                            }
                            System.out.print("Средняя сложность, для категории "
                                    + category.getIdCategory() + " = ");
                            System.out.printf("%.1f", sum/count);
                            System.out.println();
                        }
                        if (number == 2) {

                        }
                        if (number == 3) {

                        }
                        if (number == 4) {

                        }
                        if (number == 5) {

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
            System.out.println();
        }
    }
}