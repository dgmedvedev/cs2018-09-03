package class_work.lesson16;

public class Notifier implements Runnable {

    private Value val;

    public Notifier(Value val) {
        this.val = val;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(1000);
            synchronized (val) {
                val.setValue(name + " поток Notifier отработал");
                val.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}