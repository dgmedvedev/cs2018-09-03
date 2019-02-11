package lesson6.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private final String TITLE_NAME = "Прямоугольник";

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getTITLE_NAME() {
        return TITLE_NAME;
    }
}