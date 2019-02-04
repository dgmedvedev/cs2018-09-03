package class_work.lesson4;

public class Dog extends Animal {
    Dog(double size,String name){
        super("dog", size,name);
    }

    void eat(Food food){
        if(food instanceof Meat) System.out.println("ням-ням");
        else System.out.println("я это не ем");
    }

    void say(){
        if(getSize()<5)
        System.out.println("тяф");
        else System.out.println("ГАВ");
    }
}
