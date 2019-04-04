package project.json;

import org.codehaus.jackson.map.ObjectMapper;
import project.category.Category;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonSave {

    public static void saveFile(String fileName, List<Category> list) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            FileWriter write = new FileWriter(fileName+".txt");
            mapper.writeValue(write, list);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}