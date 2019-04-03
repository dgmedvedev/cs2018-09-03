package project;

import project.category.Category;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public abstract class JoinLists {
    private static List<Category> categoryList = new LinkedList<>();

    public static void choiceCategory(List<Category> list_1, List<Category> list_2) {
        List<Category> tempMin;
        List<Category> tempMax;
        String tempString;
        int min = list_1.size();
        int max = list_2.size();
        if (max >= min) {
            tempMin = list_1;
            tempMax = list_2;
            tempString = " (из интернета)";
        } else {
            tempMin = list_2;
            tempMax = list_1;
            tempString = " (с жесткого диска)";
        }

        for (Category category_1 : tempMax) {
            boolean duplicate = false;
            for (Category category_2 : tempMin) {

                if (category_1.getIdCategory() == category_2.getIdCategory()) {
                    duplicate = true;
                    System.out.println("Найдено совпадение по idCategory");
                    System.out.println("Введите номер категории, которую хотите оставить:");
                    System.out.println("1. " + "\"" + category_1.getTitle() + "\"" + " из списка 1. IdCategory = " + category_1.getIdCategory() + ";");
                    System.out.println("2. " + "\"" + category_2.getTitle() + "\"" + " из списка 2"+ tempString + ". IdCategory = " + category_2.getIdCategory() + ".");
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
            if (!duplicate)
                categoryList.add(category_1);
        }
    }

    public static List<Category> getCategoryList() {
        return categoryList;
    }
}