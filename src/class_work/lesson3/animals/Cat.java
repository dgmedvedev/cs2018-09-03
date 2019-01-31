package class_work.lesson3.animals;

public class Cat extends Animal {
    Cat(String n,int a){
        name=n;
        age=a;
    }
    @Override
    void eat(Food food) {
        if(food instanceof  Fish)
            System.out.println("ням рыба!");
        else System.out.println("ням мясо!");
    }

    @Override
    void say() {
        System.out.println("мяу");
    }
}