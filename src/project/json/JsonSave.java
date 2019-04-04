package project.json;

import org.codehaus.jackson.map.ObjectMapper;
import project.JoinLists;
import project.category.Category;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class JsonSave {

    public static void saveFile(String fileName, List<Category> list) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            String temp = fileName.replaceAll("[\\\\,/,:,*,?,\",<,>,|]+", "");
            if (fileName.length() != temp.length()) {
                System.out.println("Сработала ошибка");
                throw new FileNotFoundException();
            }
            FileWriter write = new FileWriter(fileName + ".txt");
            mapper.writeValue(write, list);
        } catch (FileNotFoundException fnf) {
            System.out.println("Имя не должно содержать следующих знаков:\n" +
                    "\\ / : * ? \" < > |");
            System.out.println("Введите имя файла для сохранения:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            saveFile(name, JoinLists.getCategoryList());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}