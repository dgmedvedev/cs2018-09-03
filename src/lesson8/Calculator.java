package lesson8;

import java.util.Scanner;

public class Calculator {
    private double number1;
    private double number2;
    private String operator;

    private Scanner sc = new Scanner(System.in);

    void start() {
        System.out.println("Введите число №1");
    //try - введенное значение не явл.числом
        this.number1 = sc.nextDouble();
        System.out.println("Введите оператор (+, -, / или *)");
        this.operator = sc.next();
        System.out.println("Введите число №2");
    //try - введенное значение не явл.числом
        this.number2 = sc.nextDouble();
    }

    void operation(double number1, double number2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "/":
    //try - деление на 0
                result = number1 / number2;
                break;
            case "*":
                result = number1 * number2;
                break;
        }
        System.out.println(result);
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }
}
