package lesson6.figures.triangles;

import lesson6.figures.Figure;

public abstract class Triangle extends Figure {
    private double sideTriangleA;
    private double sideTriangleB;
    private double sideTriangleC;
    private final String TITLE_NAME;


    Triangle(String TITLE_NAME,double sideTriangleA,double sideTriangleB,double sideTriangleC) {
        this.TITLE_NAME = TITLE_NAME;
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
        this.sideTriangleC = sideTriangleC;
    }

    public abstract double getHeight();

    public double getSideTriangleA() {
        return sideTriangleA;
    }

    public double getSideTriangleB() {
        return sideTriangleB;
    }

    public double getSideTriangleC() {
        return sideTriangleC;
    }

    public String getTITLE_NAME() {
        return TITLE_NAME;
    }
}