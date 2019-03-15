package class_work.lesson16;

public class Task16_1 {
    public static void start() {
        Value val = new Value("обработать");
        Waiter waiter = new Waiter(val);
        new Thread(waiter,"waiter").start();

        Waiter waiter1 = new Waiter(val);
        new Thread(waiter1,"waiter1").start();

        Notifier notifier = new Notifier(val);
        new Thread(notifier, "notifier").start();
        System.out.println("Стартовали все потоки");
    }
}
