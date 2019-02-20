package lesson8.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    private double number1;
    private double number2;
    private String operator;

    private Scanner sc = new Scanner(System.in);

    void start() {

        try {
            System.out.println("Введите число №1");
            this.number1 = sc.nextDouble();
        } catch (InputMismatchException ime) {
            System.err.println("Неверное значение числа №1.\n" +
                    "Будьте внимательнее при вводе.");
            return;
        }
        try {
            System.out.println("Введите оператор (+, -, / или *)");
            this.operator = sc.next();
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*")) {
                System.err.println("Invalid operator value.\n" +
                        "Valid values: + , - , / or *");
                throw new OperatorException();
            }
        } catch (OperatorException oex) {
            System.out.println(oex.getRussianMessage());
            return;
        }
        try {
            System.out.println("Введите число №2");
            this.number2 = sc.nextDouble();
            if (number2 == 1 && operator.equals("/")) {
                System.err.println("In my calculator, you can not divide by 1!");
                throw new NumberException();
            }
        } catch (InputMismatchException ime) {
            System.err.println("Неверное значение числа №2.\n" +
                    "Будьте внимательнее при вводе.");
            return;
        } catch (NumberException nex) {
            System.out.println(nex.getRussianMessage());
            return;
        }
        operation(number1, number2, operator);
    }

    private void operation(double number1, double number2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "/":
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
