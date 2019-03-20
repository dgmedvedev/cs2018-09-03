package lesson16.task16_1.persons16_1.json;

import lesson16.task16_1.FileValue;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlString {
    public static void setStringJsonFromUrl(String urlName, String saveFileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL(urlName);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 FileWriter write = new FileWriter(saveFileName)) {
                String s;

                while ((s = reader.readLine()) != null) {
                    stringBuilder.append(s);
                }
                write.write(stringBuilder.toString().replaceAll("", ""));
            }
            FileValue.setJson(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
