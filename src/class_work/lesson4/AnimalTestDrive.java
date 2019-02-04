package class_work.lesson4;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Cat cat = new Cat(5, "Васька");
        Dog dog = new Dog(6,"Тузик");
        Fish fish = new Fish();
        Meat meat = new Meat();

        System.out.println(cat.toString());
        cat.eat(fish);
        System.out.println(cat.toString());
        hunter.giveShot(cat);
        hunter.giveShot(dog);

    }
}
