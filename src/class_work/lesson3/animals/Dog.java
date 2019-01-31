package class_work.lesson3.animals;

public class Dog extends Animal {
    Dog(String n,int a){
        name=n;
        age=a;
    }
    @Override
    void say() {
        System.out.println("гав");
    }

    @Override
    void eat(Food food) {
        if(food instanceof  Fish)
            System.out.println("я это не ем");
        else System.out.println("ням мясо!");
    }
}