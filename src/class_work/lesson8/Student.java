package class_work.lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private static int count;
    private int group;
    private String name;
    private Date birthday;
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    Student(int group, String date, String name) {
        count++;
        this.id = count;
        this.group = group;
        this.name = name;
        try {
            this.birthday = DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", group=" + group +
                ", name='" + name + '\'' +
                ", birthday=" + DATE_FORMAT.format(birthday);
    }

    public int getID() {
        return id;
    }

    public int getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public SimpleDateFormat getDATE_FORMAT() {
        return DATE_FORMAT;
    }
}
