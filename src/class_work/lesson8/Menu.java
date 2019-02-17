package class_work.lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Student> studentsList = new ArrayList<>();

    void isMenu() {

        printMenuOne();
        Scanner sc = new Scanner(System.in);
        boolean notExit = true;

        while (notExit) {
            String temp = sc.nextLine();//было sc.next - при вводе 2 проскакивало меню п.2
            switch (temp) {
                case "1":
                    System.out.println("Для довавления студента введите:\n" +
                            "№ группы, Дата рождения(дд.мм.гггг), ФИО");
                    int group = sc.nextInt();
                    String birthday = sc.next();
                    String name = sc.nextLine();
                    studentsList.add(new Student(group, birthday, name));
                    break;
                case "2":
                    System.out.println("Удалить по индексу или id ? (введите in / id)");
                    String text = sc.nextLine();
                    if (text.equals("in")) {
                        System.out.println("Введите номер индекса");
                        studentsList.remove(sc.nextInt());
                    } else if (text.equals("id")) {
                        System.out.println("Введите номер id");
                        int id = sc.nextInt();
                        sc.nextLine();   // не было - после удаления по id, удаляло и срабатывало default
                        for (Student st : studentsList) {
                            if (st.getID() == id) {
                                studentsList.remove(st);
                                printMenuOne();
                                break;
                            }
                        }
                    } else {
                        System.out.println("Введено неверное значение1");
                        printMenuOne();
                    }
                    break;
                case "3":
                    studentsList.clear();
                    printMenuOne();
                    break;
                case "4":
                    for (Student st : studentsList)
                        System.out.println(st.toString());
                    printMenuOne();
                    break;
                case "5":
                    System.out.println("Работа завершена");
                    notExit = false;
                    break;
                default:
                    System.out.println("Введено неверное значение");
                    printMenuOne();
                    break;
            }
        }
    }

    private static void printMenuOne() {
        System.out.println("____________________________\n");
        System.out.println("ВЫБЕРИТЕ ОПЕРАЦИЮ:");
        System.out.println("1. Добавить студента");
        System.out.println("2. Удалить студента по индексу или id");
        System.out.println("3. Очистить список");
        System.out.println("4. Отсортировать и вывести");
        System.out.println("5. Завершить работу");
        System.out.println("____________________________");
    }

    private void printMenuTwo() {
        System.out.println("____________________________\n");
        System.out.println("Отсортировать и вывести:");
        System.out.println("1. по id по возрастанию");
        System.out.println("2. по id по убываанию");
        System.out.println("3. по номеру группы");
        System.out.println("4. сначала по номеру группы, а потом по id");
        System.out.println("5. по возрасту, потом по номеру группы, потом по id");
        System.out.println("6. вернуться в прошлое меню");
        System.out.println("7. завершить работу");
        System.out.println("____________________________");
    }

    public ArrayList<Student> getList() {
        return studentsList;
    }
}