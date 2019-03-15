package lesson14.task14_2;

import lesson14.task14_2.lists.Author;

import java.util.ArrayList;

class PrintLists {
    static void printAuthorsList1(ArrayList<Author> authorsList) {
        for (Author author : authorsList) {
            System.out.println(author.getName());
            for (int j = 0; j < author.getAlbumsList().size(); j++) {
                System.out.println("   " + author.getAlbumsList().get(j).getName());
                for (int k = 0; k < author.getAlbumsList().get(j).getTitleAndDurationAndDirect().size(); k++) {
                    for (String string : author.getAlbumsList().get(j).getTitleAndDurationAndDirect().get(k))
                        System.out.print("    " + string);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}