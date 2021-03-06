package lesson14.task14_2.lists;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<String[]> titleAndDurationAndDirect = new ArrayList<>();

    public Album(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String[]> getTitleAndDurationAndDirect() {
        return titleAndDurationAndDirect;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", titleAndDurationAndDirect=" + titleAndDurationAndDirect +
                '}';
    }
}