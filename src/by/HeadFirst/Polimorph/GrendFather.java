package by.HeadFirst.Polimorph;

public class GrendFather {
    private int age;
    private int height;
    private int power;

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
    public int getPower() {
        return power;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setHeight(int h) {
        height = h;
    }
    public void setPower(int p) {
        power = p;
    }

    public void foundWeight() {
        int weight = age * height / power;
        System.out.println("weight = " + age + " * " + height + " / " + power + " = " + weight);
    }
}
