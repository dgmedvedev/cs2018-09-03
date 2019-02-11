package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VersatileTriangle extends Triangle {
    private double angleAC_inDegree; // угол треугольника между сторонами A и C в градусах

    public VersatileTriangle(double sideA, double sideB, double sideC, double angleAC) {
        super("Разносторонний треугольник", sideA, sideB, sideC);
        this.angleAC_inDegree = angleAC;
    }

    @Override
    public double getHeight() {
        double height = getSideTriangleA() * Math.sin(Math.toRadians(angleAC_inDegree));
        return new BigDecimal(height).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public double getArea() {
        double area = getHeight() * getSideTriangleC() / 2.0;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double getAngleAC_inDegree() {
        return angleAC_inDegree;
    }
}