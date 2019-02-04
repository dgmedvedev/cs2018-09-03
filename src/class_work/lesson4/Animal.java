package class_work.lesson4;

abstract class Animal {
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
    abstract void eat(Food food);

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
