package lesson6.figures.triangles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double sideA_andB,double sideC) {
        super("Равнобедренный треугольник", sideA_andB, sideA_andB, sideC);
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(getSideTriangleA(),2)-Math.pow((getSideTriangleC()/2.0),2));
    }

    @Override
    public double getArea() {
        double area = getHeight() * getSideTriangleC() / 2;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
