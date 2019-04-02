package project;

import project.category.Category;

import java.util.*;

public abstract class JoinLists {
    private static List<Category> categoryList = new LinkedList<>();

    public static void choiceCategory(List<Category> list_1, List<Category> list_2) {

        for (Category aList_1 : list_1) {
            for (Category aList_2 : list_2) {

                if (aList_1.getIdCategory() == aList_2.getIdCategory()) {
                    System.out.println("Найдено совпадение по idCategory");
                    System.out.println("Введите номер категории, которую хотите оставить:");
                    System.out.println("1. " + "\"" + aList_1.getTitle() + "\"" + " из списка 1. IdCategory = " + aList_1.getIdCategory() + ";");
                    System.out.println("2. " + "\"" + aList_2.getTitle() + "\"" + " из списка 2. IdCategory = " + aList_2.getIdCategory() + ".");
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
                        categoryList.add(aList_1);
                        System.out.println("\n" + "Выполнено успешно.");
                    }

                    if (number == 2) {
                        categoryList.add(aList_2);
                        System.out.println("\n" + "Выполнено успешно.");
                    }
                }
            }
        }

        
    }

    public static List<Category> getCategoryList() {
        return categoryList;
    }
}