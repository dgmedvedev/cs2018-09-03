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

    public String toStringPet(String[] pet) {
        String temp = "";
        StringBuilder endString = new StringBuilder();
        for (int i = 0; i < pet.length; i++) {
            if (i == 0) {
                temp = "[\"" + pet[i] + "\",";
            } else if (i < pet.length - 1) {
                temp = "\"" + pet[i] + "\",";
            } else if (i == pet.length - 1)
                temp = "\"" + pet[i] + "\"]";

            endString.append(temp);
        }

        return endString.toString();
    }

    @Override
    public String toString() {
        if (wife != null)
            if(pet!=null)
            return "\"name\": " + name + ",	\"age\":" + age + ",	\"isStudent\": " + isStudent +
                    ",	\"wife\": { \"name\": " + wife.getName() + ", \"age\": " + wife.getAge() +
                    "},	\"pet\": " + toStringPet(pet);
            else return "\"name\": " + name + ",	\"age\":" + age + ",	\"isStudent\": " + isStudent +
                    ",	\"wife\": { \"name\": " + wife.getName() + ", \"age\": " + wife.getAge() +
                    "},	\"pet\": null";
        else
        if(pet!=null)
            return "\"name\": " + name + ",	\"age\":" + age + ",	\"isStudent\": " + isStudent +
                    ",	\"wife\": null,	\"pet\": " + toStringPet(pet);
            else return "\"name\": " + name + ",	\"age\":" + age + ",	\"isStudent\": " + isStudent +
                ",	\"wife\": null,	\"pet\": null";
    }
}
