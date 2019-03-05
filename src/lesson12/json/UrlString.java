package lesson12.json;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlString {
    public static String getStringJsonFromUrl(String urlName,String saveFileName){
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
        } catch (IOException e) {
            e.printStackTrace();
        }return stringBuilder.toString();
    }
}
