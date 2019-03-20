package lesson16.task16_1;

import lesson16.task16_1.people16_1.Man;
import lesson16.task16_1.persons16_1.Person;
import lesson16.task16_1.persons16_1.json.UrlString;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Loading implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");

        synchronized (FileValue.getVALUE1()) {

            try {
                URL url = new URL("https://goo.gl/AZnd2V");
                HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                StringBuilder stringBuilder = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                     FileWriter write = new FileWriter(FileValue.getVALUE1())) {
                    String s;
                    while ((s = reader.readLine()) != null) {
                        stringBuilder.append(s);
                    }
                    write.write(stringBuilder.toString().replaceAll("", ""));
                }
                FileValue.getVALUE1().wait();

                for (Man man : FileValue.getManArrayList())
                    System.out.println(man);

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        name = Thread.currentThread().getName();
        System.out.println(name + " стартовал 2-ой раз");

        synchronized (FileValue.getVALUE2()) {

            try {
                UrlString.setStringJsonFromUrl("https://goo.gl/Hc8J4n", FileValue.getVALUE2());
                FileValue.getVALUE2().wait();

                for (Person person : FileValue.getPersonList())
                    System.out.println(person);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}