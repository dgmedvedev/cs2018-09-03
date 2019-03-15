package lesson14.task14_2_copy.files;

public class Mp3Files extends MyFiles {
    private String author;
    private String album;
    private String title;
    private String duration;
    private String directory;

    public Mp3Files(){}

    public Mp3Files(String checkSum, String author, String album, String title, String duration, String directory) {
        super(checkSum);
        this.author = author;
        this.album = album;
        this.title = title;
        this.duration = duration;
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "Mp3Files{" +
                "author='" + author + '\'' + "\n" +
                ", album='" + album + '\'' + "\n" +
                ", title='" + title + '\'' + "\n" +
                ", duration='" + duration + '\'' + "\n" +
                ", directory='" + directory + '\'' + "\n" +
                ", checkSum='" + getCheckSum() + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getDirectory() {
        return directory;
    }
}
