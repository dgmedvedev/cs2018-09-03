package lesson9.building.my_exception;

public class SpaceUsageTooMuchException extends Exception {
    public SpaceUsageTooMuchException() {
        System.err.println("Превышена площадь");
    }
}