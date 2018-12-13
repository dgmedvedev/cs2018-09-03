package by.it1.medvedev3.lesson06;

import java.util.Scanner;

public class Dog {

    String name;
    int age;
    private int weight;
    private double power;


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

    public int getWeight(){
        return weight;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public double getPower(){
        return power;
    }

    public void setPower(double p) {
        power = p;
    }

    public Dog(String name, int age,int weight,double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public String toString() {
        return "Кличка: " + this.name + ". Возраст: " + age;
    }

    public boolean win(Dog otherDog) {
        double shansThisDog;
        double shansOtherDog;

        shansThisDog = 0.2*this.age+0.3*this.weight+0.5*this.power;
        shansOtherDog = 0.2*otherDog.getAge()+0.3*otherDog.getWeight()+0.5*otherDog.getPower();
     /* System.out.println(this.name+" 0.2*"+this.age+"+0.3*"+this.weight+"+0.5*"+this.power+
                "="+shansThisDog);
        System.out.println(otherDog.getName()+" 0.2*"+otherDog.getAge()+"+0.3*"+otherDog.getWeight()
                 +"+0.5*"+otherDog.getPower()+"="+shansOtherDog);
     */
        return shansThisDog>shansOtherDog;

    }
}
