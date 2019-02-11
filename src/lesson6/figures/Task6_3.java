package lesson6.figures;

import lesson6.figures.triangles.EquilateralTriangle;

public class Task6_3 {
    public static void start() {
        Figure triangle = new EquilateralTriangle(5.6);
        System.out.println(triangle.getArea());
    }
}