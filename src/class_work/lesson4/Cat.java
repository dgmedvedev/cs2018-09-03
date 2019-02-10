package class_work.lesson4;

class Cat extends Animal implements GrandLive{

    Cat(String name) {
        super("Кот",name,"мяу", 3.6);
    }
    Cat() {
        super("Кот",null,"мяу", 3.6);
    }

    public boolean isCanEat(Food food){
        return food instanceof Fish;
    }

    @Override
    public void eat(Food food) {
        if(isCanEat(food))System.out.println("ням-ням");
        else System.out.println("я это не ем");
    }

    boolean canLive(Animal animal){
        return animal instanceof GrandLive;
    }
}
