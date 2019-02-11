package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VersatileTriangle extends Triangle {
    private double angleAC; // угол треугольника между сторонами A и C

    public VersatileTriangle(double sideA, double sideB, double sideC, double angleAC) {
        super("Разносторонний треугольник", sideA, sideB, sideC);
        this.angleAC = angleAC;
    }

    @Override
    public double getHeight() {
        return getSideTriangleA() * Math.sin(angleAC);
    }

    @Override
    public double getArea() {
        double area = Math.sin(angleAC) * getSideTriangleA() * getSideTriangleC() / 2;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double getSinAB() {
        return angleAC;
    }
}
