package project.menu;

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

    public static int menuSelection2 (){
        int number = 0;
        boolean tempBool = true;
        while (tempBool) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2) {
                    tempBool = false;
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
        int number = 0;
        boolean tempBool = true;
        while (tempBool) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number == 1 || number == 2 || number == 3) {
                    tempBool = false;
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Будьте внимательнее!");
            }
            System.out.println("Введено неверное значение! Введите 1, 2 или 3");
        }
        return number;
    }


}
