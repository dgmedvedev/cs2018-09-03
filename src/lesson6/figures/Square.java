package lesson6.figures;

public class Square extends Figure {
    private double sideSquare;

    Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }

    public double getSideSquare() {
        return sideSquare;
    }
}