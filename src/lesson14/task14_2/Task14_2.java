package lesson14.task14_2;

import lesson14.task14_2.lists.SuperList;

import java.util.Scanner;

public class Task14_2 {
    public static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к папке:");
        String dir = sc.next();
        System.out.println("Подождите...");
        System.out.println();
        Search.start(dir);
        PrintLists.printAuthorsList1(SuperList.getAuthorsList1());
        PrintLists.printAuthorsList2(SuperList.getAuthorsList2());

    }
}