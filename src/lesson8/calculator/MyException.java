package lesson8.calculator;

class MyException extends Exception{

    private String russianMessage;

    public String getRussianMessage() {
        return russianMessage;
    }

    public void setRussianMessage(String russianMessage) {
        this.russianMessage = russianMessage;
    }
}