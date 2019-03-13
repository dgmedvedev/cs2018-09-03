package lesson14.task14_2;

import lesson14.task14_2.files.Mp3Files;
import lesson14.task14_2.files.MyFiles;

import java.util.Arrays;

public class Test {
    public static void start() {
        long startTime = System.currentTimeMillis();

        Search.setAttributesMp3Files("c:\\Users\\Администратор\\Downloads\\муз\\Nirvana  - Smells Like a Teen Spirit.mp3");
        Search.setAttributesMp3Files("c:\\Users\\Администратор\\Downloads\\муз\\Scorpions - Wind of Change.mp3");

        for(Mp3Files mp3Files : MyFiles.getMp3FilesList())
            System.out.println(mp3Files.toString());
        //   Search.showTree("d:\\",0);

        System.out.println(System.currentTimeMillis() - startTime);

    }
}