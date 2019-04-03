package project.menu;

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
                    System.out.println("НЕ РАБОТАЕТ");
                    printMenu();
                    break;
                case "3":
                    System.out.println("Создать запись");
                    printMenu();
                    break;
                case "4":
                    System.out.println("Изменить запись");
                    printMenu();
                    break;
                case "5":
                    System.out.println("Удалить запись по id");
                    notExit = false;
                    break;
                case "6":
                    System.out.println("Найти запись по любому полю");
                    notExit = false;
                    break;
                case "7":
                    System.out.println("Сохранить результат своей работы в файл");
                    notExit = false;
                    break;
                case "8":
                    System.out.println("Сформировать html отчет");
                    notExit = false;
                    break;
                case "9":
                    System.out.println("Получить статистику");
                    notExit = false;
                    break;
                case "10":
                    System.out.println("Выйти из программы");
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
        System.out.println("1. Просмотреть все данные (отсортированные по id)");
        System.out.println("2. Просмотреть данные отсортированные по любому из полей (НЕ РАБОТАЕТ)");
        System.out.println("3. Создать запись (НЕ РАБОТАЕТ)");
        System.out.println("4. Изменить запись (НЕ РАБОТАЕТ)");
        System.out.println("5. Удалить запись по id (НЕ РАБОТАЕТ)");
        System.out.println("6. Найти запись по любому полю (НЕ РАБОТАЕТ)");
        System.out.println("7. Сохранить результат своей работы в файл (НЕ РАБОТАЕТ)");
        System.out.println("8. Сформировать html отчет (НЕ РАБОТАЕТ)");
        System.out.println("9. Получить статистику (НЕ РАБОТАЕТ)");
        System.out.println("10.Выйти из программы");
        System.out.println("____________________________");
    }
}
