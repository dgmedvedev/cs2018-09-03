package lesson14.task14_2;

import java.io.File;

public abstract class Search {

    public static void showTree(final String dirName, final int nest){
        File dir = new File(dirName);
        if (!dir.isDirectory()){
            return;
        }
        StringBuilder whiteSpace = new StringBuilder();
        for (int i = 0; i < nest; i++){
            whiteSpace.append(' ');
        }
        File files[] = dir.listFiles();
        if (files != null) {
            for (File file : files){
                System.out.println(whiteSpace.toString() + file.getName());
                if(file.getName().equals("Search.java"))
                    System.out.println("Ура, что-то получается");
                if (file.isDirectory()){
                    if(file.getName().equals("task14_1"))
                        System.out.println("Ура, что-то получается!!!");
                    showTree(String.valueOf(file), nest + 1);
                }
            }
        }
    }
}