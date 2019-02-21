package lesson9.building;

public class Task9_2 {
    public static void start() {
        Building building = new Building("Здание 1");
        building.addRoom("Комната 1", 30,3);
        building.addRoom("Комната 2", 30,3);
        building.addRoom("Комната 3", 30,3);
        System.out.println(building.getRoom("Комната 1").getArea());
        System.out.println(building.getRoom("Комната 4").getArea());
        System.out.println(building.getRoom("Комната 3").getArea());
    }
}
