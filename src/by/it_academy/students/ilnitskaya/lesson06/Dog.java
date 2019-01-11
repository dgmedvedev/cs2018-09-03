package by.it_academy.students.ilnitskaya.lesson06;

public class Dog {

    public String name;
    public int age;
    private int weight;
    private double power;


    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }


    public int getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    boolean win(Dog otherDog) {
        double myChance = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double otherChance = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return myChance > otherChance;

    }
}
