package lesson8.calculator;

class OperatorException extends MyException {

    OperatorException(){
        this.setRussianMessage("Неверное значение оператора.\n" +
                "Допустимые значения: + , - , / или *");
    }
}