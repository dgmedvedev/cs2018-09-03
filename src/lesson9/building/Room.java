package lesson9.building;

import java.util.ArrayList;

class Room {
    private String titleRoom;
    private double area;
    private double freeArea;
    private int windows;
    private int illumination;
    private ArrayList<Room> roomList;

    Room(String titleRoom, double area, int windows) {
        try {
            if (titleRoom != null) {
                this.titleRoom = titleRoom;
            } else throw new Exception();
        }catch (Exception ex){
            System.err.println("Такой комнаты не существует");
        }
        this.area = area;
        this.windows = windows;
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

    public ArrayList<Room> getRoomList() {
        return roomList;
    }
}
