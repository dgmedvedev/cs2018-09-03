package lesson9.building;

import java.util.ArrayList;

public class Building {
    private String titleBuilding;
    private ArrayList<Room> roomList;
    private Room room;

    Building(String titleBuilding) {
        this.titleBuilding = titleBuilding;
        this.roomList = new ArrayList<>();
    }

    void addRoom(String titleRoom, double area, int windows) {
        this.room = new Room(titleRoom, area, windows);
        this.roomList.add(room);
    }

    public Room getRoom(String titleRoom) {

        for (Room r : roomList) {
            if (r.getTitleRoom().equals(titleRoom))
                return r;
        }
        System.err.print("Комнаты " + "\"" + titleRoom + "\"" + " не существует");
        System.exit(1);
        return new Room(null, -1, -1);
    }

    public String getTitleBuilding() {
        return titleBuilding;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
