package lesson14.task14_2_copy;

import lesson14.task14_2_copy.lists.Author;

import java.util.ArrayList;

public class PrintLists {
    public static void printList1(ArrayList<Author> authorsList) {
        for (int i = 0; i < authorsList.size(); i++) {
            System.out.println(authorsList.get(i).getName());
            for (int j = 1; j <= authorsList.get(i).getAlbumsList().size(); j++) {
                System.out.println("   Альбом - " + j);
                for (int k = 0; k < authorsList.get(i).getAlbumsList().get(j - 1).getTitleAndDurationAndDirect().size(); k++) {
                    if(k==0) System.out.print("  ");
                    System.out.print(" " + authorsList.get(i).getAlbumsList().get(j - 1).getTitleAndDurationAndDirect().get(k));
                    if(k==authorsList.get(i).getAlbumsList().get(j - 1).getTitleAndDurationAndDirect().size()-1)
                        System.out.println();
                }
            }
            System.out.println();
        }
    }
}