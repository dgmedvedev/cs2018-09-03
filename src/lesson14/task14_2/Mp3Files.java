package lesson14.task14_2;

import org.tritonus.share.sampled.TAudioFormat;
import org.tritonus.share.sampled.file.TAudioFileFormat;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Mp3Files {

    public static void main(String[] args) {

        File file = new File("c:\\Users\\Администратор\\Downloads\\муз\\Scorpions - Wind of Change (vksaver).mp3");

        AudioFileFormat baseFileFormat = null;
        AudioFormat baseFormat;
        try {
            baseFileFormat = AudioSystem.getAudioFileFormat(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
        baseFormat = baseFileFormat.getFormat();
        System.out.println("baseFormat - " + baseFormat);
// TAudioFileFormat properties
        if (baseFileFormat instanceof TAudioFileFormat) {
            Map properties = ((TAudioFileFormat) baseFileFormat).properties();
            String key = "author";
            String val = (String) properties.get(key);
            System.out.println("val 1 = " + val);

            key = "title";
            val = (String) properties.get(key);
            System.out.println("val 2 = " + val);

            key = "album";
            val = (String) properties.get(key);
            System.out.println("val 3 = " + val);

            key = "duration";
            long milliseconds = (Long) properties.get(key)/1000;
            int hour = (int)(milliseconds/3600000);
            int min = (int)((milliseconds - hour)/60000);
            int sec = (int)((milliseconds/1000 - hour - (min * 60)));
            String duration = String.format("%02d:%02d:%02d", hour, min, sec);
     //       String duration = new SimpleDateFormat("HH:mm:ss").format(new Date(milliseconds));
            System.out.println("val 4 = " + duration);

            key = "mp3.id3tag.v2";
            InputStream tag = (InputStream) properties.get(key);
            System.out.println("tag 1 = " + tag);
        }
// TAudioFormat properties
        if (baseFormat instanceof TAudioFormat) {
            Map properties = ((TAudioFormat) baseFormat).properties();
            String key = "bitrate";
            Integer val = (Integer) properties.get(key);
            System.out.println("bitrate - " + val);
        }
    }
}