package lesson12;

public class Wife {
    private String name;
    private int age;

    public Wife() {
    }

    Wife(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" + "\"name\": \"" + name + "\", \"age\":" + age + "}";
    }
}
