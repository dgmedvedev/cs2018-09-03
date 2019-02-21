package lesson9.building.my_exception;

public class IlluminanceTooMuchException extends Exception {
    public IlluminanceTooMuchException(){
        System.err.println("Превышена освещённость");
    }
}