package project.menu;

import project.json.CheckSum;

import java.io.File;

public class P_10 extends Menu {
    public static void start() {
        File file_1 = new File("JoinLists.txt");
        File file_2 = new File("JoinListsStart.txt");
        String directory_1 = file_1.getAbsolutePath();
        String directory_2 = file_2.getAbsolutePath();
        String checkSum_1 = CheckSum.setCheckSum(directory_1);
        String checkSum_2 = CheckSum.setCheckSum(directory_2);
        System.out.println("directory file_1 = " + directory_1);
        System.out.println("directory file_2 = " + directory_2);
        System.out.println("checkSum_1 = " + checkSum_1);
        System.out.println("checkSum_2 = " + checkSum_2);

        if (!checkSum_1.equals(checkSum_2))
            System.out.println("Сохраните изменения перед выходом?");
    }
}