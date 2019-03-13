package lesson14.task14_2;

import org.tritonus.share.sampled.file.TAudioFileFormat;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Map;
// http://www.javazoom.net/mp3spi/documents.html

public class InfoMp3Files {

    public static void setAttributesMp3Files(String directory) {

        File file = new File(directory);

        AudioFileFormat baseFileFormat = null;
        try {
            baseFileFormat = AudioSystem.getAudioFileFormat(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
// TAudioFileFormat properties
        if (baseFileFormat instanceof TAudioFileFormat) {
            Map properties = baseFileFormat.properties();
            String key = "author";
            String val = (String) properties.get(key);
            System.out.println("author = " + val);

            key = "title";
            val = (String) properties.get(key);
            System.out.println("title = " + val);

            key = "album";
            val = (String) properties.get(key);
            System.out.println("album = " + val);

            key = "duration";
            long milliseconds = (Long) properties.get(key)/1000;
            int hour = (int)(milliseconds/3600000);
            int min = (int)((milliseconds - hour)/60000);
            int sec = (int)((milliseconds/1000 - hour - (min * 60)));
            String duration = String.format("%02d:%02d:%02d", hour, min, sec);
     //     String duration = new SimpleDateFormat("HH:mm:ss").format(new Date(milliseconds)); - разобраться
            System.out.println("duration = " + duration);

        }
    }
}