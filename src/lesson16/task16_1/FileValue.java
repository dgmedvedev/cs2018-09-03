package lesson16.task16_1;

import lesson16.task16_1.people16_1.Man;
import lesson16.task16_1.persons16_1.Person;

import java.util.ArrayList;
import java.util.List;

public class FileValue {
    private static final String VALUE1 = "text16_1a.txt";
    private static final String VALUE2 = "text16_1b.txt";
    private static String json;
    private static ArrayList<Man> manArrayList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();


    public static void setJson(String json) {
        FileValue.json = json;
    }

    public static String getJson() {
        return json;
    }

    public static void setPersonList(List<Person> personList) {
        FileValue.personList = personList;
    }

    public static List<Person> getPersonList() {
        return personList;
    }

    public static ArrayList<Man> getManArrayList() {
        return manArrayList;
    }

    public static String getVALUE1() {
        return VALUE1;
    }

    public static String getVALUE2() {
        return VALUE2;
    }
}
