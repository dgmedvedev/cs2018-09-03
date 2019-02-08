package class_work.lesson4;

class Cat extends Animal {

    Cat(double size, String name) {
        super("cat", size, name);
    }



    public boolean isCanEat(Food food){
        return food instanceof Fish;
    }


    void say() {
        System.out.println("мяу");
    }
}
