package class_work.lesson4;

abstract class Animal implements AbleToEat{
    private String name;
    private double size;
    private final String TITLE;
    private boolean hungry=true;

    Animal(String title, double size,String name){
        this.size = size;
        this.name = name;
        TITLE = title;
    }

    abstract void say();
    void say(Animal a){
        a.say();
    }

    public void eat(Food food) {
        if (isHungry()) {
            if (isCanEat(food)) {
                setHungry(false);
                say();
            } else setName(null);
        } else {
            if(isCanEat(food)){
                if(getName()!=null)
                    System.out.println(getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", TITLE='" + TITLE + '\'' +
                '}';
    }

    public String getTITLE() {
        return TITLE;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public boolean isHungry() {
        return hungry;
    }
    public void setHungry(boolean hungry){
        this.hungry = hungry;
    }

    public void setName(String name) {
        this.name = name;
    }
}
