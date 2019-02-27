package lesson9.building;

import lesson9.building.furniture.Furniture;
import lesson9.building.my_exception.IlluminanceTooLittleException;
import lesson9.building.my_exception.IlluminanceTooMuchException;
import lesson9.building.my_exception.SpaceUsageTooMuchException;

import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private String titleRoom;
    private double areaRoom;
    private double freeAreaRoom;
    private double notFreeAreaRoom;
    private double notFreeAreaRoomMax;
    private double notFreeAreaRoomMin;
    private int windows;
    private final int WINDOWS_LUX = 700;
    private int illumination;
    private ArrayList<Lamp> lampList;
    private ArrayList<Furniture> furnitureList;
    private Scanner sc = new Scanner(System.in);

    Room(String titleRoom, double area, int windows) {
        this.titleRoom = titleRoom;
        this.areaRoom = area;
        this.freeAreaRoom = area;
        this.windows = windows;
        this.illumination = findIllumination(windows);
        this.lampList = new ArrayList<>();
        this.furnitureList = new ArrayList<>();
    }

    private int findIllumination(int windows) {

        if (windows <= 0) {
            System.out.println("Освещенность равна " + getIllumination() + " лк");
            System.out.println("Освещенности недостаточно для создания комнаты " + "\"" + titleRoom + "\"" + " (минимум 300 лк).\n" +
                    "Для добавления освещенности введите:\n" +
                    "1. Добавить окно (1 окно - " + WINDOWS_LUX + " лк);\n" +
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
                    else return this.windows * WINDOWS_LUX;
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
                    else if (lamp < 300) {// в моем случае можно добавлять нерабочие лампочки
                        this.illumination += lamp;
                        this.lampList.add(new Lamp(lamp));
                        while (this.illumination < 300) {
                            System.out.println("Освещенность равна " + this.illumination);
                            System.out.println("Минимальное значение должно быть 300.");
                            System.out.println("Добавьте еще лампочку. Введите значение:");
                            lamp = sc.nextInt();
                            this.illumination += lamp;
                            this.lampList.add(new Lamp(lamp));
                            if (this.illumination < 0) {
                                System.err.println("Введено отрицательное значение. Будьте внимательнее!");
                                System.exit(1);
                            }
                        }
                        return this.illumination;
                    } else return this.windows * WINDOWS_LUX;
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
                    return this.windows * WINDOWS_LUX;
            }
        return windows * WINDOWS_LUX;
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

    void add(Furniture furniture) {

        if (furniture.getMinAreaFurniture() == 0) {
            try {
                if (this.freeAreaRoom - furniture.getAreaFurniture() >= areaRoom * 0.3) {
                    this.freeAreaRoom -= furniture.getAreaFurniture();
                    this.furnitureList.add(furniture);
                } else throw new SpaceUsageTooMuchException();
            } catch (SpaceUsageTooMuchException stm) {
                System.exit(1);
            }
        }else if(furniture.getAreaFurniture() == 0){
            try {
                if (this.freeAreaRoom - furniture.getMaxAreaFurniture() >= areaRoom * 0.3) {
                    this.freeAreaRoom -= furniture.getMaxAreaFurniture();
                    this.furnitureList.add(furniture);
                } else throw new SpaceUsageTooMuchException();
            } catch (SpaceUsageTooMuchException stm) {
                System.exit(1);
            }
        }
    }

    public void toString(ArrayList list) {

        StringBuilder string = new StringBuilder();
        String and = "";
        for (Object obj : list) {
            if (obj instanceof Furniture) {
                if (((Furniture) obj).getMinAreaFurniture() == 0) {
                    string.append(((Furniture) obj).getTitle_name()).
                            append(" (площадь ").append(((Furniture) obj).
                            getAreaFurniture()).append(" м^2)\n   ");


                } else if (((Furniture) obj).getAreaFurniture() == 0) {
                    string.append(((Furniture) obj).getTitle_name()).
                            append(" (площадь от ").append(((Furniture) obj).
                            getMinAreaFurniture()).append(" м^2 до ").append(((Furniture) obj).
                            getMaxAreaFurniture()).append(" м^2)\n   ");
                }
            } else if (obj instanceof Lamp) {
                string.append(and).append(((Lamp) obj).getLux()).append(" лк");
                and = " и ";
            }
        }
        System.out.print(string);
    }

    public String getTitleRoom() {
        return titleRoom;
    }

    public double getAreaRoom() {
        return areaRoom;
    }

    public int getWindows() {
        return windows;
    }

    public int getWINDOWS_LUX() {
        return WINDOWS_LUX;
    }

    public int getIllumination() {
        return illumination;
    }

    public ArrayList<Lamp> getLampList() {
        return lampList;
    }

    public ArrayList<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public double getFreeAreaRoom() {
        return freeAreaRoom;
    }

    public double getNotFreeAreaRoomMax() {
        for (Furniture furniture : furnitureList)
            notFreeAreaRoomMax += furniture.getMaxAreaFurniture()+furniture.getAreaFurniture();
        return notFreeAreaRoomMax;
    }

    public double getNotFreeAreaRoomMin() {
        notFreeAreaRoom = 0;
        for (Furniture furniture : furnitureList)
            notFreeAreaRoomMin += furniture.getMinAreaFurniture()+furniture.getAreaFurniture();
        return notFreeAreaRoomMin;
    }

    public double getNotFreeAreaRoom() {
        for (Furniture furniture : furnitureList)
            notFreeAreaRoom += furniture.getAreaFurniture();
        return notFreeAreaRoom;
    }
}