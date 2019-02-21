package lesson9.building.my_exception;

public class IlluminanceTooLittleException extends Exception {
    public IlluminanceTooLittleException(){
        System.err.println("Освещенности недостаточно");
    }
}
