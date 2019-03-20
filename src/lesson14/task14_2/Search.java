package lesson14.task14_2;

import lesson14.task14_2.files.Mp3Files;
import lesson14.task14_2.files.MyFiles;
import lesson14.task14_2.lists.Album;
import lesson14.task14_2.lists.Author;
import lesson14.task14_2.lists.SuperList;
import org.tritonus.share.sampled.file.TAudioFileFormat;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Search {


    public static void start(final String dirName) {
        File dir = new File(dirName);
        if (!dir.isDirectory()) {
            return;
        }

        File files[] = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (format(file.getName()).equals("mp3") ||
                        format(file.getName()).equals("Mp3") ||
                        format(file.getName()).equals("mP3") ||
                        format(file.getName()).equals("MP3") && !file.isDirectory()) {

                    Mp3Files temp = newMp3Files(file);

                    boolean bool = false;
                    for (Author author : SuperList.getAuthorsList1()) {
                        if (temp.getAuthor().equals(author.getName())) {
                            //исправить ошибку
                            for (Album album : author.getAlbumsList()) {
                                if (temp.getAlbum().equals(album.getName())) {
                                    boolean booll = false;
                                    for (String[] strings : album.getTitleAndDurationAndDirect()) {

                                        if (temp.getTitle().equals(strings[0])) {
                                            booll = true;
                                            SuperList.getAuthorsList2().add(temp);
                                        }
                                    }
                                    if (!booll)
                                        album.getTitleAndDurationAndDirect()
                                                .add(new String[]{temp.getTitle(), temp.getDuration(), temp.getDirectory()});
                                } else
                                    author.getAlbumsList()
                                            .add(addAlbum(temp, temp.getTitle(), temp.getDuration(), temp.getDirectory()));
                            }

                            bool = true;
                        }
                    }
                    if (!bool) {
                        Author tempAuthor = new Author(temp.getAuthor());
                        tempAuthor.getAlbumsList().add(addAlbum(temp, temp.getTitle(), temp.getDuration(), temp.getDirectory()));
                        SuperList.getAuthorsList1().add(tempAuthor);
                    }
                }
                if (file.isDirectory()) {
                    start(String.valueOf(file));
                }
            }
        }
    }

    private static Album addAlbum(Mp3Files mp3, String title, String duration, String directory) {
        Album tempAlbum = new Album(mp3.getAlbum());
        tempAlbum.getTitleAndDurationAndDirect().add(new String[]{title, duration, directory});
        return tempAlbum;
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

    public static Mp3Files newMp3Files(File file) {
        Mp3Files mp3File = new Mp3Files();

        AudioFileFormat baseFileFormat = null;
        try {
            baseFileFormat = AudioSystem.getAudioFileFormat(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
        if (baseFileFormat instanceof TAudioFileFormat) {
            Map properties = baseFileFormat.properties();
            String key = "author";
            String author = (String) properties.get(key);
            if (author == null)
                author = "неизвестный исполнитель";
            author = author.trim();
            if (author.isEmpty())
                author = "неизвестный исполнитель";

            key = "title";
            String title = (String) properties.get(key);
            if (title == null)
                title = "нет названия";
            title = title.trim();
            if (title.isEmpty())
                title = "нет названия";

            key = "album";
            String album = (String) properties.get(key);
            if (album == null)
                album = "нет альбома";
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
            if (duration.isEmpty())
                duration = "продолжительность неизвестна";

            String checkSum = CheckSum.setCheckSum(file.getAbsolutePath());

            String directory = file.getAbsolutePath();

            mp3File = new Mp3Files(checkSum, author, album, title, duration, directory);
            MyFiles.getMp3FilesList().add(mp3File);
        }
        return mp3File;
    }
}