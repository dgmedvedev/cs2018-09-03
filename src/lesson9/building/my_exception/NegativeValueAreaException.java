package lesson9.building.my_exception;

public class NegativeValueAreaException extends Exception {
    public NegativeValueAreaException() {
        System.err.println("Площадь мебели должна быть больше нуля");
    }
}