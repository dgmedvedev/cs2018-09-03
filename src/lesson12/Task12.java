package lesson12;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lesson12.json.JsonReader;
import lesson12.json.UrlString;
import org.json.JSONObject;

import java.util.List;

public class Task12 {
    public static void start() {
        String json1 = "[\n" +
                "{\n" +
                "\"name\":\"John\",\n" +
                "\"age\":20" +
                "},\n" +
                "{\n" +
                "\"name\":\"Jordan\",\n" +
                "\"age\":30\n" +
                "}\n" +
                "]";

        String json = UrlString.getStringJsonFromUrl("https://goo.gl/Hc8J4n", "text12_hw.txt");

        // ДЗ 12.1
        List<Person> personList = JsonReader.getPersons(json);

        for (Person person : personList)
            System.out.println(person);

        // ДЗ 12.2
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Wife.class, new WifeSerializer())
                .create();
        String json2 = gson.toJson(personList);
        System.out.println(json2);

        gson = new GsonBuilder()
                .registerTypeAdapter(Wife.class, new WifeDeserializer())
                .create();
        PersonBand personBand = gson.fromJson(json2, PersonBand.class);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
//        System.out.println(gson.toJson(personBand));
    }
}