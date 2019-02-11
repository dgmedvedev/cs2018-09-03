package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RightTriangle extends Triangle {
    public RightTriangle(double katetA, double katetB) {
        super("Прямоугольный треугольник", katetA, katetB, Math.pow(katetA, 2) + Math.pow(katetB, 2));
    }

    @Override
    public double getHeight() {
        double height = getSideTriangleA();
        return new BigDecimal(height).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public double getArea() {
        double area = getHeight() * getSideTriangleB() / 2.0;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}