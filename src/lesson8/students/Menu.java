package lesson8.students;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

class Menu {
    private ArrayList<Student> studentsList = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);
    private Scanner sc1 = new Scanner(System.in);

    void isMenu() {

        printMenuOne();

        while (true) {
            try {

                short number = sc.nextShort();
                int group;
                String birthday, name, text;

                switch (number) {
                    case 1:
                        System.out.println("Для добавления студента введите через пробел:\n" +
                                "№ группы, Дата рождения(дд.мм.гггг), ФИО");

                        group = sc.nextInt();
                        birthday = sc.next();
                        name = sc.nextLine();

                        studentsList.add(new Student(group, birthday, name));
                        System.out.println("Студент" + name + " успешно добавлен в список");
                        printMenuOne();
                        break;
                    case 2:
                        System.out.println("Удалить по индексу или id ? (введите in / id)");
                        text = sc1.next();
                        switch (text) {
                            case "in":
                                System.out.println("Введите номер индекса");
                                int index = sc1.nextShort();
                                if (index < studentsList.size()) {
                                    studentsList.remove(index);
                                    System.out.println("Студент с номеров индекса " + index + " удален");
                                } else
                                    System.out.println("Максимальный индекс студента равен " + (studentsList.size() - 1));
                                break;
                            case "id":
                                System.out.println("Введите номер id");
                                int id = sc1.nextInt();
                                int temp = 0;
                                int studentsListLength = studentsList.size();
                                for (Student st : studentsList) {
                                    if (st.getID() == id) {
                                        studentsList.remove(temp);
                                        System.out.println("Студент с номером id " + id + " удален");
                                        break;
                                    }
                                    temp++;
                                }
                                if (studentsListLength == studentsList.size())
                                    System.out.println("Студента с номером id " + id + " нету в списке");
                                break;
                            default:
                                System.out.println("Введено неверное значение");
                                break;
                        }
                        printMenuOne();
                        break;
                    case 3:
                        studentsList.clear();
                        System.out.println("Список очищен");
                        printMenuOne();
                        break;
                    case 4:
                        for (Student st : studentsList)
                            System.out.println(st.toString());
                        printMenuOne();
                        break;
                    case 5:
                        try {
                            FileWriter writer = new FileWriter("students.txt");
                            for (Student st : studentsList) {
                                writer.write(st.toString());
                                writer.append('\n');
                            }
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    case 6:
                        System.out.println("Работа завершена");
                        return;
                    default:
                        System.out.println("Введено неверное значение");
                        printMenuOne();
                        break;
                }
            } catch (InputMismatchException ime) {
                System.err.println("Нужно вводить цифру от 1 до 6. Будьте внимательнее!");
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
        System.out.println("4. Вывести список студентов");
        System.out.println("5. Сохранить список");
        System.out.println("6. Завершить работу");
        System.out.println("____________________________");
    }

    public ArrayList<Student> getList() {
        return studentsList;
    }
}