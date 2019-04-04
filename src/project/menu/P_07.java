package project.menu;

import project.JoinLists;
import project.json.JsonSave;

import java.util.Scanner;

public class P_07 {
    public static void start() {
        System.out.println("Введите имя файла для сохранения:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        JsonSave.saveFile(fileName, JoinLists.getCategoryList());
    }
}