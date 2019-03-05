package class_work.lesson12;

public class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private Wife wife;
    private String[] pet;

    Person(String name, int age, boolean isStudent, Wife wife, String[] pet) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.wife = wife;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isStudent() {
        return isStudent;
    }
}
