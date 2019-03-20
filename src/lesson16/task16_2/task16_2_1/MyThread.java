package lesson16.task16_2.task16_2_1;

public class MyThread extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void end() {
        this.running = false;
    }
}
