package lesson7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthday;
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    private int ageYear;
    private int ageMonth;

    Student(String name, String surname, String date) {
        this.name = name;
        this.surname = surname;
        try {
            this.birthday = DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

/*    int getAgeInDays() {
        Date today = new Date();
        long difference = today.getTime() - birthday.getTime();
        return (int) (difference / (24 * 60 * 60 * 1000));
    }
*/
    int[] getIntBirthday() {
        String date = DATE_FORMAT.format(this.birthday);
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6));
        return new int[]{day, month, year};
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public SimpleDateFormat getDateFormat() {
        return DATE_FORMAT;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }
}
