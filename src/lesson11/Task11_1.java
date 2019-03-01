package lesson11;

import lesson11.People.Man;
import lesson11.People.SAXMans;

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
    private static ArrayList<Man> manArrayList = new ArrayList<>();

    public static ArrayList<MyClass> getMyClassArrayList() {
        return myClassArrayList;
    }

    public static ArrayList<Man> getManArrayList() {
        return manArrayList;
    }

    public static void start() {

        try {
            URL url1 = new URL("https://goo.gl/tFpBDV");
            URL url2 = new URL("https://goo.gl/AZnd2V");
            HttpsURLConnection connection1 = (HttpsURLConnection) url1.openConnection();
            HttpsURLConnection connection2 = (HttpsURLConnection) url2.openConnection();
            StringBuilder stringBuilder1 = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection1.getInputStream()));
                 FileWriter write = new FileWriter("text11_1a.txt")) {
                String s;
                while ((s = reader.readLine()) != null) {
                    stringBuilder1.append(s);
                }
                write.write(stringBuilder1.toString().replaceAll("", ""));
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
                 FileWriter write = new FileWriter("text11_1b.txt")) {
                String s;
                while ((s = reader.readLine()) != null) {
                    stringBuilder2.append(s);
                }
                write.write(stringBuilder2.toString().replaceAll("", ""));
            }

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SAXPars saxp = new SAXPars();
            SAXMans saxm = new SAXMans();
            parser.parse(new File("text11_1a.txt"), saxp);
            parser.parse(new File("text11_1b.txt"), saxm);

            System.out.println("ЗАДАНИЕ 11_1 - часть 1");
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
            System.out.println();
            System.out.println("ЗАДАНИЕ 11_1 - часть 2");
            for(Man man : manArrayList){
                System.out.println(man.toString());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}