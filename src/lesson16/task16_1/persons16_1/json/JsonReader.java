package lesson16.task16_1.persons16_1.json;

import lesson16.task16_1.persons16_1.Person;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonReader {

    public static List<Person> getPersons(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> personList = new ArrayList<>();
        try {
            personList = Arrays.asList(mapper.readValue(json, Person[].class));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return personList;
    }
}