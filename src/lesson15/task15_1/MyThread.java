package lesson15.task15_1;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            Task15_1.print10();
        }
    }
}