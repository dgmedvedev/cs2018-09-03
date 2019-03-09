package class_work.lesson15;

public class Task15_2 {
    private static Long value = 10000L;

    public static void start() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                    while (true) {
                        synchronized (value) {
                        try {
                            Thread.sleep(100);
                            value -= 100;
                            System.out.println("-1");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                    while (true) {
                        synchronized (value) {
                        try {
                            Thread.sleep(100);
                            value += 100;
                            System.out.println("+1");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread.start();
        thread2.start();
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
