package lesson13.json13;

import lesson12.Person_copy;
import lesson13.Person13;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonReader13 {

    public List<Person13> getPersons13(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Person13> methodList13 = new ArrayList<>();
        try {
            methodList13 = Arrays.asList(mapper.readValue(json, Person13[].class));
        } catch (IOException e) {
            System.out.println(e);
        }
        return methodList13;
    }
}