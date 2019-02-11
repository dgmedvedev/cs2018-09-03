package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super("Равносторонний треугольник", side, side, side);
    }

    @Override
    public double getHeight() {
        double height = (Math.sqrt(3.0) / 2.0) * getSideTriangleA();
        return new BigDecimal(height).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public double getArea() {
        double area = getHeight() * getSideTriangleA() / 2.0;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}