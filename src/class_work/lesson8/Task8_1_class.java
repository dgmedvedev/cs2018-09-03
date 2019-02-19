package class_work.lesson8;

public class Task8_1_class {
    public static void start() {
        Menu menu = new Menu();

        menu.getList().add(new Student(24, "29.03.2000", "Иван"));
        menu.getList().add(new Student(25, "29.03.2005", "Иван"));

        menu.isMenu();

        for (Student st : menu.getList())
            System.out.println(st.toString());
    }
}