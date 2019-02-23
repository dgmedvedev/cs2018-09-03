package lesson9_copy.building.my_exception;

public class IlluminanceTooMuchException extends Exception {
    public IlluminanceTooMuchException() {
        System.err.println("Превышена освещённость");
    }
}