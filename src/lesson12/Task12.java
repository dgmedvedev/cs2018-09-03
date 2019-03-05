package lesson12;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lesson12.json.JsonReader;
import lesson12.json.UrlString;
import org.json.JSONArray;
import org.json.simple.JSONValue;

import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void start() {
        System.out.println("ДЗ 12.1");
        String json = UrlString.getStringJsonFromUrl("https://goo.gl/Hc8J4n", "text12_hw.txt");

        List<Person> personList = JsonReader.getPersons(json);

        for (Person person : personList)
            System.out.println(person);

        System.out.println();
        System.out.println("ДЗ 12.2_1");
        PersonBand personBand = new PersonBand();
        for (Person person : personList)
            personBand.addPerson(person);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Wife.class, new WifeSerializer())
                .create();
        json = gson.toJson(personBand);
        System.out.println(json);

        System.out.println();
        System.out.println("ДЗ 12.2_2");
        gson = new GsonBuilder()
                .registerTypeAdapter(Wife.class, new WifeDeserializer())
                .create();
        personBand = gson.fromJson(json, PersonBand.class);

        for (Person person : personBand.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("ДЗ 12.3");

        String temp = "";
        StringBuilder endString = new StringBuilder();
        for (int i = 0; i < personBand.getPersons().size(); i++) {
            if (i == 0) {
                temp = "[{" + personBand.getPersons().get(i).toString() + "},";
            } else if (i < personBand.getPersons().size() - 1) {
                temp = "{" + personBand.getPersons().get(i).toString() + "},";
            } else if (i == personBand.getPersons().size() - 1)
                temp = "{" + personBand.getPersons().get(i).toString() + "}]";

            endString.append(temp);
        }
        json = endString.toString();

        System.out.println(json);
    }
}