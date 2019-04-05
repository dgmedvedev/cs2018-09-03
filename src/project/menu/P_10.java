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

        if (!checkSum_1.equals(checkSum_2)) {
            System.out.println("У Вас есть несохраненные данные.\n" +
                    "Вы точно хотите выйти без сохранения?" + "\n" +
                    "1. Да;" + "\n" +
                    "2. Нет.");

            int number = P_10.menuSelection2();

            if (number == 1) {
                System.out.println("Good bye!");
            }
            if (number == 2) {
                P_07.start();
            }
        }
    }
}