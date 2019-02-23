package lesson9.building;

import lesson9.building.furniture.*;

public class Task9_2 {
    public static void start() {
        Building building1 = new Building("ЗДАНИЕ 1");
        building1.addRoom("Комната 1", 15,2);
        building1.addRoom("Комната 2", 20,3);
        building1.getRoom("Комната 1").add(new Lamp(100));
        building1.getRoom("Комната 1").add(new Lamp(150));
        building1.getRoom("Комната 1").add(new Table("стол 1",0.9));
        building1.getRoom("Комната 1").add(new Chair("стул 1","0.3-0.5"));

        Building building2 = new Building("ЗДАНИЕ 2");
        building2.addRoom("Комната 1", 10,3);
        building2.addRoom("Комната 2", 12,4);
        building2.getRoom("Комната 2").add(new Lamp(200));
        building2.getRoom("Комната 2").add(new Lamp(300));
        building2.getRoom("Комната 2").add(new Dresser("шкаф 1",1.2));
        building2.getRoom("Комната 2").add(new Bed("кровать 1","3-3.5"));

        building1.describe();
        building2.describe();
    }
}