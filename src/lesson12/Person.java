package lesson12;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private Wife wife;
    private String[] pet;

    public Person() {

    }

    Person(String name, int age, boolean isStudent, Wife wife, String[] pet) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.wife = wife;
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public void setPet(String[] pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsStudent() {
        return isStudent;
    }

    public Wife getWife() {
        return wife;
    }

    public String[] getPet() {
        return pet;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                ", wife=" + wife +
                ", pet=" + Arrays.toString(pet) +
                '}';
    }
}
