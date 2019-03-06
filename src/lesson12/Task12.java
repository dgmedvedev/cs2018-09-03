package lesson12;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lesson12.json.JsonReader;
import lesson12.json.UrlString;
import org.json.JSONArray;
import org.json.JSONObject;
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

        JSONObject mainObj = new JSONObject();
        JSONArray ja = new JSONArray();
        for (Person person : personBand.getPersons()) {
            JSONObject jo = new JSONObject();
            jo.put("name", person.getName());
            jo.put("age", person.getAge());
            jo.put("isStudent", person.getIsStudent());
            if (person.getWife() != null) {
                JSONObject wifeObj = new JSONObject();
                wifeObj.put("name", person.getWife().getName());
                wifeObj.put("age", person.getWife().getAge());
                jo.put("wife", wifeObj);
            }
            if (person.getPet() != null)
                jo.put("pet", person.getPet());

            ja.put(jo);
        }
        mainObj.put("persons", ja);

        String endJson = mainObj.toString();

        System.out.println(endJson);

    }
}