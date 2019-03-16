package lesson14.task14_2;

import lesson14.task14_2.files.Mp3Files;
import lesson14.task14_2.lists.SuperList;

public class Test {
    public static void start() {
        long startTime = System.currentTimeMillis();

        Search.start("c:\\Users\\Администратор\\Downloads\\temp\\");
        PrintLists.printAuthorsList1(SuperList.getAuthorsList1());
        PrintLists.printAuthorsList2(SuperList.getAuthorsList2());
        for (Mp3Files mp3 : SuperList.getAuthorsList2())
            System.out.println(mp3.toString());

        System.out.println(SuperList.getAuthorsList2().size());

        System.out.println(System.currentTimeMillis() - startTime);

    }
}