package class_work.lesson4;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "Васька");
        Fish fish = new Fish();
        Meat meat = new Meat();

        System.out.println(cat.toString());

        cat.eat(fish);
        System.out.println(cat.toString());
    }
}
