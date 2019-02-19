package lesson8;

public class Task8_1 {
    public static void start() {
        Calculator calculator = new Calculator();
        calculator.start();
        //try - если без ошибок
        calculator.operation(calculator.getNumber1(),calculator.getNumber2(),calculator.getOperator());
        System.err.println("good");
    }
}