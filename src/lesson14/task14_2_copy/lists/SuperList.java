package lesson14.task14_2_copy.lists;

import java.util.ArrayList;

public class SuperList {
    private static ArrayList<Author> authorsList1 = new ArrayList<>();
    private static ArrayList<Author> authorsList2 = new ArrayList<>();


    public static ArrayList<Author> getAuthorsList1() {
        return authorsList1;
    }

    public static ArrayList<Author> getAuthorsList2() {
        return authorsList2;
    }
}