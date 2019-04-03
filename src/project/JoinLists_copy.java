package project;

import project.category.Category;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.TemporaryTask;

import java.util.*;

public abstract class JoinLists_copy {
    private static List<Category> categoryList = new LinkedList<>();
    private static List<Category> finalCategoryList = new LinkedList<>();
    private static List<RequiredTask> finalRequiredTaskList = new LinkedList<>();
    private static List<TemporaryTask> finalTemporaryTaskList = new LinkedList<>();
    private static List<EverydayTask> finalEverydayTaskList = new LinkedList<>();

    /*
    private static HashSet<Category> temp = new HashSet<>();
    public static void choiceCategory_1( List<Category> a, List<Category> b ) {

        temp.addAll(a);

        temp.addAll(b);

        for (Category category : temp) {
            System.out.println(category);
        }
    }
*/

    public static void choiceCategory(List<Category> list_1, List<Category> list_2) {

        for (Category category_1 : list_1) {
            for (Category category_2 : list_2) {

                if (category_1.getIdCategory() == category_2.getIdCategory()) {
                    System.out.println("Найдено совпадение по idCategory");
                    System.out.println("Введите номер категории, которую хотите оставить:");
                    System.out.println("1. " + "\"" + category_1.getTitle() + "\"" + " из списка 1. IdCategory = " + category_1.getIdCategory() + ";");
                    System.out.println("2. " + "\"" + category_2.getTitle() + "\"" + " из списка 2. IdCategory = " + category_2.getIdCategory() + ".");
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
                        categoryList.add(category_1);
                        System.out.println("\n" + "Выполнено успешно.");
                    }

                    if (number == 2) {
                        categoryList.add(category_2);
                        System.out.println("\n" + "Выполнено успешно.");
                    }
                }
            }
        }

        for (Category category : categoryList)
            System.out.println(category);

        Category.setIdCategories(0);
        for (Category category : categoryList)
            finalCategoryList.add(new Category(category.getTitle(), category.getColor()));

        for (Category category : finalCategoryList)
            System.out.println(category);

        if (categoryList.get(1).getRequiredTaskList().get(3).getId() ==
                categoryList.get(2).getRequiredTaskList().get(0).getId() &&
                categoryList.get(1).getRequiredTaskList().get(3).getId() != 0 &&
                categoryList.get(2).getRequiredTaskList().get(0).getId() != 0) {
            System.out.println("Найдено совпадение по idTask");
            System.out.println("Введите номер задачи, которую хотите оставить:");
            System.out.println("1. " + "\"" + categoryList.get(1).getRequiredTaskList().get(3).getTitleTask() + "\"" + " из категории " + "\"" + categoryList.get(1).getTitle() + "\"" + ";");
            System.out.println("2. " + "\"" + categoryList.get(2).getRequiredTaskList().get(0).getTitleTask() + "\"" + " из категории " + "\"" + categoryList.get(2).getTitle() + "\"" + ".");
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
                finalCategoryList.get(1).getRequiredTaskList().add(categoryList.get(1).getRequiredTaskList().get(3));
                categoryList.get(2).getRequiredTaskList().remove(0);
                System.out.println("\n" + "Выполнено успешно.");
            }

            if (number == 2) {
                finalCategoryList.get(2).getRequiredTaskList().add(categoryList.get(2).getRequiredTaskList().get(0));
                System.out.println("\n" + "Выполнено успешно.");
            }
        }

        for (Category category : finalCategoryList)
            System.out.println(category);

    }

    public static List<Category> getCategoryList() {
        return categoryList;
    }
}