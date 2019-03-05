package lesson12;

import lesson12.json.JsonReader;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void start() {
        String result="";
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL("https://goo.gl/Hc8J4n");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();


            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 FileWriter write = new FileWriter("text12_hw.txt")) {
                String s;

                while ((s = reader.readLine()) != null) {
                    stringBuilder.append(s);
                    result +=s;
                }
                write.write(stringBuilder.toString().replaceAll("", ""));
            }





        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONArray jsonArray = new JSONArray(stringBuilder.toString().replaceAll("\"pet\": null", "\"pet\": []"));
        System.out.println(jsonArray.toString());


        String json = "[\n" +
                "{\n" +
                "\"name\":\"John\",\n" +
                "\"age\":20" +
                "},\n" +
                "{\n" +
                "\"name\":\"Jordan\",\n" +
                "\"age\":30\n" +
                "}\n" +
                "]";

     //   result = result.replaceAll("=",":");

        List<Person> personList = JsonReader.getPersons(stringBuilder.toString());

        for (Person person : personList)
            System.out.println(person);
    }
}