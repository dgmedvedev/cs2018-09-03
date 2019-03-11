package lesson15.task15_2;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            Task15_2.print10();
        }
    }
}