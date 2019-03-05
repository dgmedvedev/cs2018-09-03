package lesson13;

import lesson13.json13.JsonReader13;

import java.util.List;

public class Task13 {
    public static void start() {
        JsonReader13 reader13 = new JsonReader13();
        String json = "[\n" +
                "{\n" +
                "\"name\":\"John\"" +
                "},\n" +
                "{\n" +
                "\"name\":\"Jordan\"\n" +
                "}\n" +
                "]";

        List<Person13> personList = reader13.getPersons13(json);

        for (Person13 person : personList)
            System.out.println(person);
    }
}
