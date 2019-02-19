package lesson8.students;

import java.io.*;
import java.util.Arrays;

public class Task8_3 {
    public static void start() {
        Menu menu = new Menu();
        Student student = null;

        try {
            FileReader fileReader = new FileReader("students.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                count++;
                String[] info = line.split("_");
                int group = Integer.parseInt(info[1].substring(6));
                String date = info[3].substring(9);
                String name = info[2].substring(5);
                menu.getList().add(student = new Student(group, date, name));
                student.setId(Integer.parseInt(info[0].substring(12)));
            }
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++)
                arr[i] = student.getID();
            Arrays.sort(arr);
            if (count > 0)
                Student.setCount(arr[count - 1]);

            reader.close();

            menu.isMenu();

        } catch (IOException ex) {
            System.out.println("Список студентов пуст");
            menu.isMenu();
        }
    }
}