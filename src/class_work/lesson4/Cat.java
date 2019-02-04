package class_work.lesson4;

class Cat extends Animal {
    Cat(double size, String name) {
        super("cat", size, name);
    }

    void eat(Food food) {
        if (isHungry()) {
            if (food instanceof Fish) {
                setHungry(false);
                say();
            } else setName(null);
        } else {
            if(food instanceof Fish){
                if(getName()!=null)
                    System.out.println(getName());
            }
        }
    }

    void say() {
        System.out.println("мяу");
    }
}
