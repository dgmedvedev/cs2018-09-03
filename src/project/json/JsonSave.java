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
    private static String file;

    public static void saveFile(String fileName, List<Category> list) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            String name = fileName.replaceAll("[\\\\,/,:,*,?,\",<,>,|]+", "");
            if (fileName.length() != name.length()) {
                throw new FileNotFoundException();
            }
            file = fileName  + ".txt";
            FileWriter write = new FileWriter(file);
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

    public static String getFile() {
        return file;
    }
}