package lesson13;

public class Person13 {
    private String name;

    Person13() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person13{" +
                "name='" + name + '\'' +
                '}';
    }
}