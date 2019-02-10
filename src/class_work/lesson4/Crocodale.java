package class_work.lesson4;

public class Crocodale extends Animal implements GrandLive,WaterLive{
    Crocodale(String name) {
        super("Крокодил",name,"...", 10.5);
    }
    Crocodale() {
        super("Крокодил",null,"...", 10.5);
    }

    public boolean isCanEat(Food food){
        return (food instanceof Meat)||(food instanceof Fish);
    }

    @Override
    public void eat(Food food) {
        if(isCanEat(food))System.out.println("ням-ням");
        else System.out.println("я это не ем");
    }
}