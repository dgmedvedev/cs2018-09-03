package lesson14.task14_2_copy;

import lesson14.task14_2_copy.lists.SuperList;

public class Test_copy {
    public static void start() {
        long startTime = System.currentTimeMillis();

        //   Search.setAttributesMp3Files("c:\\Users\\Администратор\\Downloads\\муз\\Nirvana  - Smells Like a Teen Spirit.mp3");
        //   Search.setAttributesMp3Files("c:\\Users\\Администратор\\Downloads\\муз\\Scorpions - Wind of Change.mp3");

        //   for(Mp3Files mp3Files : MyFiles.getMp3FilesList())
        //       System.out.println(mp3Files.toString());

        Search_copy.start("c:\\Users\\Администратор\\Downloads\\муз\\one\\");
        PrintLists.printList1(SuperList.getAuthorsList1());

        System.out.println(System.currentTimeMillis() - startTime);

    }
}