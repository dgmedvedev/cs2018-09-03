package by.it1.decisions_9h37m53s.lesson06_1h42m52s;

public class Dog {
    private String name; //кличка собаки
    private int age; //возраст собаки
    private int weight; //вес собаки
    private double power; //сила укуса собаки

    public Dog() {

    }

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public Dog(String n, int a, int w, double p) {
        name = n;
        age = a;
        weight = w;
        power = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double p) {
        power = p;
    }

    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }

    boolean win(Dog otherDog) {
        double chanceWinThisDog = 0.2*this.getAge() +0.3*this.getWeight() +0.5*this.getPower();
        double chanceWinOtherDog = 0.2*otherDog.getAge() +0.3*otherDog.getWeight() +0.5*otherDog.getPower();
        return chanceWinThisDog>chanceWinOtherDog;
    }
}