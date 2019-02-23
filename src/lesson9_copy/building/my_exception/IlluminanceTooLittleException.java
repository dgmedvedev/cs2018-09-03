package lesson9_copy.building.my_exception;

public class IlluminanceTooLittleException extends Exception {
    public IlluminanceTooLittleException() {
        System.err.println("Освещенности недостаточно");
    }
}
