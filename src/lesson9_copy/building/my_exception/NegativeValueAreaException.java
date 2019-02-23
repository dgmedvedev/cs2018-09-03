package lesson9_copy.building.my_exception;

public class NegativeValueAreaException extends Exception {
    public NegativeValueAreaException() {
        System.err.println("Площадь мебели должна быть больше нуля");
    }
}