package lesson6.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure {
    private double radius;
    private final String TITLE_NAME;

    Circle(double radius) {
        this.radius = radius;
        this.TITLE_NAME = "Круг";
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String getTITLE_NAME() {
        return TITLE_NAME;
    }

    public double getRadius() {
        return radius;
    }
}