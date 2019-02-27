package class_work.lesson12;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Task12_1 {
    public static void start() {

        URL url = null;
        try {
            url = new URL("https://goo.gl/Hc8J4n");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpsURLConnection connection = null;
        try {
            connection = (HttpsURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                FileWriter write = new FileWriter("text.txt")) {
            String s;
            while ((s = reader.readLine()) != null) {
                stringBuilder.append(s);
            }
            write.write(stringBuilder.toString().replaceAll("", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONArray jsonArray = new JSONArray(stringBuilder.toString().replaceAll("\"pet\": null", "\"pet\": []"));
        System.out.println(jsonArray.toString());

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONArray jsonArray1 = jsonArray.getJSONObject(i).getJSONArray("pet");
            if (jsonArray.getJSONObject(i).get("pet") != null && jsonArray1.length() != 0) {

                System.out.println(jsonArray.getJSONObject(i).get("name") + " - " +
                        jsonArray.getJSONObject(i).get("age") + " - " +
                        jsonArray.getJSONObject(i).getJSONArray("pet").get(jsonArray1.length() - 1));
            } else System.out.println(jsonArray.getJSONObject(i).get("name") + " - " +
                    jsonArray.getJSONObject(i).get("age"));

            int age = jsonArray.getJSONObject(i).getInt("age")+1;
            jsonArray.getJSONObject(i).put("age",age);
        }

        Gson gson = new Gson();

        Person[] p = gson.fromJson(stringBuilder.toString(),Person[].class);
        String STR = gson.toJson(p);

        Gson gson1 = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Wife.class,new WifeSerializer())
                .create();


    }
}