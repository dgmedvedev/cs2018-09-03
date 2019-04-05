package project.menu;

import project.JoinLists;
import project.category.Category;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void isMenu() {

        printMenu();
        Scanner sc = new Scanner(System.in);
        boolean notExit = true;

        while (notExit) {
            String temp = sc.next();
            switch (temp) {
                case "1":
                    P_01.start();
                    printMenu();
                    break;
                case "2":
                    P_02.start();
                    printMenu();
                    break;
                case "3":
                    P_03.start();
                    printMenu();
                    break;
                case "4":
                    P_04.start();
                    printMenu();
                    break;
                case "5":
                    P_05.start();
                    printMenu();
                    break;
                case "6":
                    P_06.start();
                    printMenu();
                    break;
                case "7":
                    P_07.start();
                    printMenu();
                    break;
                case "8":
                    P_08.start();
                    printMenu();
                    break;
                case "9":
                    P_09.start();
                    printMenu();
                    break;
                case "10":
                    P_10.start();
                    notExit = false;
                    break;
                default:
                    System.out.println("Введено неверное значение");
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("____________________________\n");
        System.out.println("ВЫБЕРИТЕ ОПЕРАЦИЮ:");
        System.out.println("1. Просмотреть все данные");
        System.out.println("2. Просмотреть данные отсортированные по любому из полей (НЕ РАБОТАЕТ)");
        System.out.println("3. Создать запись");
        System.out.println("4. Изменить запись");
        System.out.println("5. Удалить запись по id");
        System.out.println("6. Найти запись по любому полю");
        System.out.println("7. Сохранить результат своей работы в файл");
        System.out.println("8. Сформировать html отчет (НЕ РАБОТАЕТ)");
        System.out.println("9. Получить статистику (НЕ РАБОТАЕТ)");
        System.out.println("10.Выйти из программы");
        System.out.println("____________________________");
    }

    public static int rating() {
        String id = "";
        boolean range = false;
        while (!range) {
            try {
                Scanner sc = new Scanner(System.in);
                id = sc.nextLine();

                if (Integer.parseInt(id) >= 0 && Integer.parseInt(id) <= 10) {
                    range = true;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Будьте внимательнее. Вводите только числа!");
            }
            if (!range) System.out.println("Значение должно быть от 0 до 10 включительно.");

        }
        return Integer.parseInt(id);
    }

    public static int menuSelection2 (){
        int number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2) {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Будьте внимательнее!");
            }
            System.out.println("Введено неверное значение! Введите 1 или 2");
        }
        return number;
    }

    public static int menuSelection3 (){
        int number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2 || number == 3) {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Будьте внимательнее!");
            }
            System.out.println("Введено неверное значение! Введите 1, 2 или 3");
        }
        return number;
    }

    public static int menuSelection4 (){
        int number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2 || number == 3 || number == 4) {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Будьте внимательнее!");
            }
            System.out.println("Введено неверное значение! Введите 1, 2, 3 или 4");
        }
        return number;
    }

    public static int menuSelection5 (){
        int number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5) {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Будьте внимательнее!");
            }
            System.out.println("Введено неверное значение! Введите 1, 2, 3, 4 или 5");
        }
        return number;
    }

    public static void categorySearchByID(){
        System.out.println("Введите id категории:");
        boolean duplicate = false;
        try {
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();
            for (Category category : JoinLists.getCategoryList()) {
                if (category.getIdCategory() == Integer.parseInt(id)) {
                    System.out.println(category);
                    duplicate = true;
                    break;
                }
            }
        }catch (NumberFormatException nfe){
            System.out.println("Будьте внимательнее. Вводите только числа!");
        }

        if (!duplicate) System.out.println("Категории с таким id не существует");
    }
}