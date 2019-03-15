package lesson14.task14_2;

import lesson14.task14_2.files.Mp3Files;
import lesson14.task14_2.files.MyFiles;
import org.tritonus.share.sampled.file.TAudioFileFormat;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// http://www.javazoom.net/mp3spi/documents.html
// https://javatalks.ru/topics/33955

public abstract class Search_copy {

    public static void showTree(final String dirName) {
        File dir = new File(dirName);
        if (!dir.isDirectory()) {
            return;
        }

        File files[] = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (format(file.getName()).equals("mp3")||
                        format(file.getName()).equals("Mp3")||
                        format(file.getName()).equals("mP3")||
                        format(file.getName()).equals("MP3")){
                    System.out.println("mp3 - " + file.getName());
                    if (file.getName().equals("Nirvana  - Smells Like a Teen Spirit.mp3"))
                        System.out.println("Ура, что-то получается");
                }
                if (file.isDirectory()) {
                    if (file.getName().equals("new"))
                        System.out.println("Ура, что-то получается!!!");
                    showTree(String.valueOf(file));
                }
            }
        }
    }

    private static String format(String string) {
        String result = "";
        Pattern p = Pattern.compile("(\\.)[A-Za-z0-9]+");
        Matcher m = p.matcher(string);
        for (int i = 0; i < string.length(); i++)
            if (m.find()) {
                result = m.group();
            }
        result = result.replace(".", "");
        return result;
    }

    public static void setAttributesMp3Files(String directory) {
        Mp3Files tempMp3File;

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
            String author = (String) properties.get(key);
            author = author.trim();
            if (author.isEmpty())
                author = "неизвестный исполнитель";

            key = "title";
            String title = (String) properties.get(key);
            title = title.trim();
            if (title.isEmpty())
                title = "нет названия";

            key = "album";
            String album = (String) properties.get(key);
            album = album.trim();
            if (album.isEmpty())
                album = "нет альбома";

            key = "duration";
            long milliseconds = (Long) properties.get(key) / 1000;
            int hour = (int) (milliseconds / 3600000);
            int min = (int) ((milliseconds - hour) / 60000);
            int sec = (int) ((milliseconds / 1000 - hour - (min * 60)));
            String duration = String.format("%02d:%02d:%02d", hour, min, sec);
            //     String duration = new SimpleDateFormat("HH:mm:ss").format(new Date(milliseconds)); - разобраться

            tempMp3File = new Mp3Files(CheckSum.setCheckSum(directory), author, album, title, duration, directory);
            MyFiles.getMp3FilesList().add(tempMp3File);

        }
    }
}