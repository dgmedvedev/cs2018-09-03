package class_work.lesson4;

abstract class Animal implements AbleToEat {
    private String name;
    private double size;
    private String voice;
    private final String TITLE;
    public boolean isHungry = true;

    Animal(String title, String name, String voice, double size) {
        this.size = size;
        this.name = name;
        this.voice = voice;
        this.TITLE = title;
    }

    public void say() {
        System.out.println(voice);
    }

    public void eat(Food food) {
        if (isHungry) {
            if (isCanEat(food))
                say();
            else
                name = null;
            isHungry = false;
        }else {
            if (isCanEat(food) && name != null && !name.isEmpty())
                System.out.println(name);
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

    public void setName(String name) {
        this.name = name;
    }
}
