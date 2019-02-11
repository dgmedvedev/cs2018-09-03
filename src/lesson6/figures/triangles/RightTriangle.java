package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RightTriangle extends Triangle{
    public RightTriangle(double sideA,double sideB,double hypotenuse) {
        super("Прямоугольный треугольник",sideA,sideB,hypotenuse);
    }

    @Override
    public double getHeight() {
        return getSideTriangleA();
    }

    @Override
    public double getArea() {
        double area = getHeight() * getSideTriangleB() / 2;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
