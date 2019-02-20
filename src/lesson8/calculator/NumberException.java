package lesson8.calculator;

class NumberException extends MyException {

    NumberException() {
        this.setRussianMessage("В моем калькуляторе делить на 1 нельзя!");
    }
}