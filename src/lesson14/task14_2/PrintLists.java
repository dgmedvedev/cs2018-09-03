package lesson14.task14_2;

import lesson14.task14_2.files.Mp3Files;
import lesson14.task14_2.lists.Author;
import lesson14.task14_2.lists.SuperList;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintLists {
    public static void printAuthorsList1(ArrayList<Author> authorsList) {
        for (int i = 0; i < authorsList.size(); i++) {
            System.out.println(authorsList.get(i).getName());
            for (int j = 0; j < authorsList.get(i).getAlbumsList().size(); j++) {
                System.out.println("   " + authorsList.get(i).getAlbumsList().get(j).getName());
                for (int k = 0; k < authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().size(); k++) {
                    for (String string : authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().get(k))
                        System.out.print("    " + string);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public static void printAuthorsList2(LinkedList<Mp3Files> mp3List) {
        for (int i = 0; i < mp3List.size(); i++) {
            System.out.println(mp3List.get(i).getAuthor() + ", " + mp3List.get(i).getAlbum() + ", " + mp3List.get(i).getTitle() + ":");
            System.out.println("+ " + mp3List.get(i).getDirectory());
            for (int j = 1; j < mp3List.size(); j++) {

                if (mp3List.get(i).getAuthor().equals(mp3List.get(j).getAuthor()) &&
                        mp3List.get(i).getAlbum().equals(mp3List.get(j).getAlbum()) &&
                        mp3List.get(i).getTitle().equals(mp3List.get(j).getTitle())&&
                        !mp3List.get(i).getDirectory().equals(mp3List.get(j).getDirectory())) {
                    System.out.println("+ " + mp3List.get(j).getDirectory());
                    mp3List.remove(j);
                    j--;
                }
            }
        }
        mp3List.clear();
    }
}