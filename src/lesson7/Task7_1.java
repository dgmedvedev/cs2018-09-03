package lesson7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task7_1 {

    private GregorianCalendar calendar = new GregorianCalendar();
    private int yearToday = calendar.get(Calendar.YEAR);
    private int monthToday = calendar.get(Calendar.MONTH) + 1;
    private int dayToday = calendar.get(Calendar.DAY_OF_MONTH);

    public static void start() {
        System.out.println("Сколько студентов добавить в массив?");
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[sc.nextInt()];
        System.out.println("Вводите информацию о студентах в следующем виде:\n" +
                "Имя    Фамилия    Дата рождения(дд.мм.гггг)");
        for (int i = 0; i < students.length; i++) {
            String name = sc.next();
            String surname = sc.next();
            String birthday = sc.next();
            students[i] = new Student(name, surname, birthday);
        }

        Task7_1 task = new Task7_1();
        task.findAge(students);

        int sumYear = 0;
        int sumMonth = 0;
        for (Student st : students) {
            sumYear += st.getAgeYear();
            sumMonth += st.getAgeMonth();
        }
        int midYear = sumYear / students.length;
        int midMonth = sumMonth / students.length;

        System.out.println("Средний возраст всех студентов: " + midYear + " лет " + midMonth + " мес.");

    }

    private void findAge(Student[] students) {
        for (Student st : students) {
            int[] mas = st.getIntBirthday();


            if (monthToday > mas[1]) st.setAgeYear(yearToday - mas[2]);
            else if (monthToday == mas[1] && dayToday >= mas[0]) st.setAgeYear(yearToday - mas[2]);
            else if (!calendar.isLeapYear(yearToday) && dayToday == 28 && monthToday == 2 &&
                    calendar.isLeapYear(mas[2]) && mas[0] == 29 && mas[1] == 2) st.setAgeYear(yearToday - mas[2]);
            else st.setAgeYear(yearToday - mas[2] - 1);

            if (dayToday >= mas[0] && monthToday >= mas[1]) st.setAgeMonth(monthToday - mas[1]);
            else if (dayToday < mas[0] && monthToday > mas[1]) st.setAgeMonth(monthToday - mas[1] - 1);
            else if (dayToday >= mas[0] && monthToday < mas[1]) st.setAgeMonth(12 - mas[1] + monthToday);
            else if (dayToday < mas[0] && monthToday <= mas[1]) st.setAgeMonth(12 - mas[1] + monthToday - 1);
            else if (!calendar.isLeapYear(yearToday) && dayToday == 28 && monthToday == 2 &&
                    mas[0] == 29 && mas[1] == 2) st.setAgeMonth(0);
        }
    }
}