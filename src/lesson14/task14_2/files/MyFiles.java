package lesson14.task14_2.files;

import java.util.ArrayList;

public abstract class MyFiles {
    private String checkSum;
    private static ArrayList<Mp3Files> mp3FilesList = new ArrayList<>();

    public MyFiles(String checkSum) {
        this.checkSum = checkSum;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public static ArrayList<Mp3Files> getMp3FilesList() {
        return mp3FilesList;
    }

}
