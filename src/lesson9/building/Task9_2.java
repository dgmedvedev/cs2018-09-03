package lesson9.building;

public class Task9_2 {
    public static void start() {
        Building building1 = new Building("Здание 1");
        building1.addRoom("Комната 1", 15,0);
        building1.addRoom("Комната 2", 20,2);

        System.out.println(building1.getRoom("Комната 1").getIllumination());
        System.out.println(building1.getRoom("Комната 2").getIllumination());
        /*
        building1.getRoom("Комната 1").add(new Lamp(300));
        building1.getRoom("Комната 2").add(new Lamp(600));
        System.out.println(building1.getRoom("Комната 1").getIllumination());
        System.out.println(building1.getRoom("Комната 2").getIllumination());

        Building building2 = new Building("Здание 2");
        building2.addRoom("Комната 10", 150,3);
        building2.addRoom("Комната 20", 200,4);
        System.out.println(building2.getRoom("Комната 10").getIllumination());
        System.out.println(building2.getRoom("Комната 20").getIllumination());
        building2.getRoom("Комната 10").add(new Lamp(900));
        building2.getRoom("Комната 20").add(new Lamp(1200));
        System.out.println(building2.getRoom("Комната 10").getIllumination());
        System.out.println(building2.getRoom("Комната 20").getIllumination());
        */
    }
}