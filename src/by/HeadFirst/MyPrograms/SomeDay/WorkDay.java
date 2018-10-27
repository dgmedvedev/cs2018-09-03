package by.HeadFirst.MyPrograms.SomeDay;

import java.util.Scanner;

public class WorkDay {
    private int carsWork = 0;
    private int carsRepair = 0;
    private int carsRest = 0;
    boolean workShift = true;

    public void setCarsRepair(int cars) {
        carsRepair = cars;
    }

    public int getCarsRepair() {
        return carsRepair;
    }

    public void setCarsRest(int cars) {
        carsRest = cars;
    }

    public int getCarsRest() {
        return carsRest;
    }

    public void setCarsWork(int cars) {
        carsWork = 120 - cars;
    }

    public int getCarsWork() {
        return carsWork;
    }

    public void yesOrNo() {
        System.out.println("Вы пойдёте на работу?");
        while (true) {
            System.out.println("Пожалуйста ответьте: 'Да' или 'Нет'");
            Scanner sc = new Scanner(System.in);
            String i = sc.next();

            if (i.equals("Да")) {
                System.out.println("Good");
                break;
            } else if (i.equals("Нет")) {
                System.out.println("Вы уволены");
                break;
            }
        }
    }
}

