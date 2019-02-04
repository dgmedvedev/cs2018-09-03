package lesson5.home_appliances;

public class Task5_1 {
    public static void start() {
        HomeAppliances[] arr = new HomeAppliances[6];
        arr[0] = new Fridge(60, 50, 200, "белый");
        arr[1] = new Humidifier(20, 25, 35, "черный");
        arr[2] = new Microwave(45, 30, 20, "серебристый");
        arr[3] = new MusicCentre(70, 25, "черный");
        arr[4] = new TV(120, 71.5, "черный");
        arr[5] = new Vacuum(25, 35, 25.5, "черный");

        for (HomeAppliances i : arr) {
            i.work();
            System.out.println(i.toString());
            System.out.println();
        }
    }
}