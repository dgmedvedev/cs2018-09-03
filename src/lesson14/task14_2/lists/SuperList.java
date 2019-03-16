package lesson14.task14_2.lists;

import lesson14.task14_2.files.Mp3Files;

import java.util.ArrayList;
import java.util.LinkedList;

public class SuperList {
    private static ArrayList<Author> authorsList1 = new ArrayList<>();
    private static LinkedList<Mp3Files> authorsList2 = new LinkedList<>();


    public static ArrayList<Author> getAuthorsList1() {
        return authorsList1;
    }

    public static LinkedList<Mp3Files> getAuthorsList2() {
        return authorsList2;
    }
}