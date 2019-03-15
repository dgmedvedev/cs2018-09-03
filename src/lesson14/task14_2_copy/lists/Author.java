package lesson14.task14_2_copy.lists;

import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Album> albumsList = new ArrayList<>();

    public Author(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbumsList() {
        return albumsList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", albumsList=" + albumsList +
                '}';
    }
}