package class_work.lesson4;

public class Dog extends Animal implements GrandLive {
    Dog(String name) {
        super("Собака", name, "гав", 5.5);
    }

    Dog() {
        super("Собака", null, "гав", 5.5);
    }

    public void eat(Food food) {
        if (isCanEat(food)) System.out.println("ням-ням");
        else System.out.println("я это не ем");
    }

    public boolean isCanEat(Food food) {
        return food instanceof Meat;
    }

    boolean canLive(Animal animal){
        return animal instanceof GrandLive;
    }
}