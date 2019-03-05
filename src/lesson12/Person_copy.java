package lesson12;

public class Person_copy {
    private String name;

    Person_copy() {

    }

    Person_copy(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}