package class_work.lesson16;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                int random = 100 + (int)(Math.random()+300);
                Thread.sleep(random);
                System.out.println("Работает " + Thread.currentThread().getName() + "; random = " + random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}