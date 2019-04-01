package project.json;

import org.codehaus.jackson.map.ObjectMapper;
import project.category.Category;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.TemporaryTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonReader {

    public static List<Category> getCategories(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Category> methodList = new ArrayList<>();

        try {
            methodList = Arrays.asList(mapper.readValue(json,Category[].class));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return methodList;
    }
}