package class_work.lesson16;

public class Waiter implements Runnable{

    private Value val;

    public Waiter(Value v){
        this.val = v;
    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        synchronized (val){
            try {
                System.out.println(name + " жду вызова notify: " + System.currentTimeMillis());
                val.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " был вызван notify: " + System.currentTimeMillis());
            // обрабатываем сообщение
            System.out.println(name + " : " + val.getValue() + "!");

        }
    }

}
