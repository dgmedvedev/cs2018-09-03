package lesson12.json;

import lesson12.Person;
import lesson12.Person_copy;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonReader {

    public static List<Person> getPersons(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> methodList = new ArrayList<>();
        try {
            methodList = Arrays.asList(mapper.readValue(json, Person[].class));
        } catch (IOException e) {
            System.out.println(e);
        }
        return methodList;
    }
}