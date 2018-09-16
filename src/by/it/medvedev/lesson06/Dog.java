package by.it.medvedev.lesson06;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private int power;

public Dog(){

}
public Dog(String name, int age){
    this.name=name;
    this.age=age;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //задание А2
    //Code\Override Methode\toString


    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }

    //задание C1
    boolean win(Dog otherDog){
    double myChance=0.2*this.age+0.3*this.weight+0.5*this.power;
        double otherChance=0.2*this.age+0.3*this.weight+0.5*this.power;
        return myChance>otherChance;
    }
}
