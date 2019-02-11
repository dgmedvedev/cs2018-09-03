package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super("Равносторонний треугольник", side, side, side);
    }

    @Override
    public double getHeight() {
        return (Math.sqrt(3) / 2.0) * getSideTriangleA();
    }

    @Override
    public double getArea() {
        double area = getHeight() * getSideTriangleA() / 2;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}