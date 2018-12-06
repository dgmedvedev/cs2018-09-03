package by.HeadFirst.Polimorph;

public class Father extends GrendFather {
    private int mind;

    public int getMind() {
        return mind;
    }

    public void setMind(int m) {
        mind = m;
    }

    public void foundWeight(Father x) {
        int weight = x.getAge() * x.getHeight() / x.getPower() + x.getMind();
        System.out.println("weight = " + x.getAge() + " * " + x.getHeight() + " / " + x.getPower() + " + " + x.getMind() + " = " + weight);
    }
}
