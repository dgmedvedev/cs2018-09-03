package lesson9.building;

import lesson9.building.my_exception.IlluminanceTooLittleException;
import lesson9.building.my_exception.IlluminanceTooMuchException;

import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private String titleRoom;
    private double area;
    private double freeArea;
    private int windows;
    private int illumination;
    private ArrayList<Lamp> lampList;
    private Scanner sc = new Scanner(System.in);

    Room(String titleRoom, double area, int windows) {
        this.titleRoom = titleRoom;
        this.area = area;
        this.windows = windows;
        this.illumination = findIllumination(windows);
        this.lampList = new ArrayList<>();
    }

    private int findIllumination(int windows) {

        if (windows <= 0) {
            System.out.println("Освещенность равна " + getIllumination() + " лк");
            System.out.println("Освещенности недостаточно для создания комнаты " + "\"" + titleRoom + "\"" + " (минимум 300 лк).\n" +
                    "Для добавления освещенности введите:\n" +
                    "1. Добавить окно (1 окно - 700 лк);\n" +
                    "2. Добавить лампочку (лк в зависимости от лампочки).");
            int value = sc.nextInt();
            int window;
            int lamp;
            switch (value) {
                case 1:
                    System.out.println("Сколько окон Вы хотите добавить?");
                    System.out.println("Допустимое количество 1-5");
                    window = sc.nextInt();
                    this.windows = window;
                    if (window > 5) try {
                        throw new IlluminanceTooMuchException();
                    } catch (IlluminanceTooMuchException itm) {
                        System.exit(1);
                    }
                    else if (window <= 0) try {
                        throw new IlluminanceTooLittleException();
                    } catch (IlluminanceTooLittleException itl) {
                        System.exit(1);
                    }
                    else return this.windows * 700;
                case 2:
                    System.out.println("Лампочку какой освещенности Вы хотите добавить?");
                    lamp = sc.nextInt();
                    if (lamp > 4000) try {
                        throw new IlluminanceTooMuchException();
                    } catch (IlluminanceTooMuchException itm) {
                        System.exit(1);
                    }
                    else if (lamp < 0) try {
                        throw new IlluminanceTooLittleException();
                    } catch (IlluminanceTooLittleException itl) {
                        System.exit(1);
                    }
                    else if (lamp < 300) {
                        this.illumination += lamp;
                        while (this.illumination < 300) {
                            System.out.println("Освещенность равна " + this.illumination);
                            System.out.println("Минимальное значение должно быть 300.");
                            System.out.println("Добавьте еще лампочку. Введите значение:");
                            lamp = sc.nextInt();
                            this.illumination += lamp;
                            if (this.illumination < 0) {
                                System.err.println("Введено отрицательное значение. Будьте внимательнее!");
                                System.exit(1);
                            }
                        }
                        return this.illumination;
                    } else return this.windows * 700;
            }
        } else if (windows > 5)
            try {
                throw new IlluminanceTooMuchException();
            } catch (IlluminanceTooMuchException itm) {
                int window;
                System.out.println("Допустимое количество окон 1-5");
                System.out.println("Введите допустимое значение окон для комнаты " + "\"" + this.titleRoom + "\"");
                window = sc.nextInt();
                this.windows = window;
                if (window > 5) try {
                    throw new IlluminanceTooMuchException();
                } catch (IlluminanceTooMuchException itme) {
                    System.exit(1);
                }
                else if (window <= 0) try {
                    throw new IlluminanceTooLittleException();
                } catch (IlluminanceTooLittleException itl) {
                    System.exit(1);
                }
                else
                    return this.windows * 700;
            }
        return windows * 700;
    }

    void add(Lamp lamp) {
        try {
            if ((lamp.getLux() + this.illumination) <= 4000) {
                this.illumination += lamp.getLux();
                this.lampList.add(lamp);
            } else throw new IlluminanceTooMuchException();
        } catch (IlluminanceTooMuchException itm) {
            System.exit(1);
        }
    }

    public String getTitleRoom() {
        return titleRoom;
    }

    public double getArea() {
        return area;
    }

    public int getWindows() {
        return windows;
    }

    public double getFreeArea() {
        return freeArea;
    }

    public int getIllumination() {
        return illumination;
    }

    public ArrayList<Lamp> getLampList() {
        return lampList;
    }
}
