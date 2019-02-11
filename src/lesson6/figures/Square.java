package lesson6.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Figure {
    private double sideSquare;
    private final String TITLE_NAME;

    Square(double sideSquare) {
        this.sideSquare = sideSquare;
        this.TITLE_NAME = "Квадрат";
    }

    @Override
    public double getArea() {
        double area = sideSquare * sideSquare;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String getTITLE_NAME() {
        return TITLE_NAME;
    }

    public double getSideSquare() {
        return sideSquare;
    }
}