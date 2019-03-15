package lesson14.task14_2_copy;

import lesson14.task14_2_copy.lists.Author;

import java.util.ArrayList;

public class PrintLists {
    public static void printAuthorsList1(ArrayList<Author> authorsList) {
        for (int i = 0; i < authorsList.size(); i++) {
            System.out.println(authorsList.get(i).getName());
            for (int j = 0; j < authorsList.get(i).getAlbumsList().size(); j++) {
                System.out.println("   " + authorsList.get(i).getAlbumsList().get(j).getName());
                for (int k = 0; k < authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().size(); k++) {
                    for(String string : authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().get(k))
                        System.out.print("    " + string);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public static void printAuthorsList2(ArrayList<Author> authorsList) {
        for (int i = 0; i < authorsList.size(); i++) {
            System.out.println(authorsList.get(i).getName());
            for (int j = 0; j < authorsList.get(i).getAlbumsList().size(); j++) {
                System.out.println("   " + authorsList.get(i).getAlbumsList().get(j).getName());
                for (int k = 0; k < authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().size(); k++) {
                    if(k==0) System.out.print("  ");
                    for(String string : authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().get(k))
                    System.out.print(" " + string);
                    if(k==authorsList.get(i).getAlbumsList().get(j).getTitleAndDurationAndDirect().size()-1)
                        System.out.println();
                }
            }
            System.out.println();
        }
    }
}