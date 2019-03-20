package lesson16.task16_1;

public class Task16_1 {


    public static void start() {

        Loading load = new Loading();
        new Thread(load, "Поток загрузки").start();
        Processing process = new Processing();
        new Thread(process, "Поток обработки").start();

    }
}