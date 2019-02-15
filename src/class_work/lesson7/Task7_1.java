package class_work.lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите формат даты");
        String format = sc.nextLine();
        System.out.println("Введите дату в формате "+format);
        SimpleDateFormat simpleDate = new SimpleDateFormat(format);
        String date = sc.nextLine();
        try {
            System.out.println(simpleDate.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Введите формат даты для вывода");
        String formatOut = sc.nextLine();
        SimpleDateFormat simpleDate2 = new SimpleDateFormat(formatOut);
        System.out.println("Для вывода даты в консоль нажмите k\n"+
                "иначе дата сохранится в файл file.txt");
        String choice = sc.next();

        if(choice.equals("k")) {

            try {
                System.out.println(simpleDate2.format(simpleDate.parse(date)));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                FileWriter writer = new FileWriter("file.txt");
                writer.write(date);
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
