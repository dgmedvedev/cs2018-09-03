package lesson6.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private final String TITLE_NAME;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.TITLE_NAME = "Прямоугольник";
    }

    @Override
    public double getArea() {
        double area = length * width;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String getTITLE_NAME() {
        return TITLE_NAME;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}