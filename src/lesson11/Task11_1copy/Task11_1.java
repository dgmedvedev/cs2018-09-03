package lesson11.Task11_1copy;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Task11_1 {
    private static ArrayList<MyClass> myClassArrayList = new ArrayList<>();

    public static ArrayList<MyClass> getMyClassArrayList() {
        return myClassArrayList;
    }

    public static void start() {


        try {
            URL url = new URL("https://goo.gl/tFpBDV");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 FileWriter write = new FileWriter("text11_1.txt")) {
                String s;
                while ((s = reader.readLine()) != null) {
                    stringBuilder.append(s);
                }
                write.write(stringBuilder.toString().replaceAll("", ""));
            }


            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SAXPars saxp = new SAXPars();
            parser.parse(new File("text11_1.txt"), saxp);

            for (int i = 0; i < myClassArrayList.size(); i++) {
                System.out.println(String.format("Имя класса " + (i + 1) + ": %s", myClassArrayList.get(i).getName()));
                for (int j = 0; j < myClassArrayList.get(i).getMethodList().size(); j++) {
                    if (myClassArrayList.get(i).getMethodList().get(j).getValue() != null) {
                        System.out.println(String.format(" Имя метода " + (j + 1) + " в классе " + (i + 1) +
                                ": %s", myClassArrayList.get(i).getMethodList().get(j).getName()));
                        System.out.println(String.format("  Значение метода " + (j + 1) + " в классе " + (i + 1) +
                                ": %s", myClassArrayList.get(i).getMethodList().get(j).getValue()));
                    } else System.out.println(String.format(" Имя метода " + (j + 1) + " в классе " + (i + 1) +
                            ": %s", myClassArrayList.get(i).getMethodList().get(j).getName()));

                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}