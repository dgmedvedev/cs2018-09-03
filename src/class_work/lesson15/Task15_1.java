package class_work.lesson15;

public class Task15_1 {

    public static void start() {
        long startTime = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                        System.out.println("Вывод сообщения");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        while (true){
            try {
                System.out.println(System.currentTimeMillis()-startTime);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}