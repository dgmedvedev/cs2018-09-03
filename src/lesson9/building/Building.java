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

    void describe() {
        System.out.print(titleBuilding);
        for (Room room : roomList) {
            System.out.print(" \n" + room.getTitleRoom() + "\n  " +
                    "Освещенность = " + room.getIllumination() +
                    "(" + room.getWindows() + " окна по " + room.getWINDOWS_LUX() + " лк");
            if (!room.getLampList().isEmpty()) {
                System.out.print(", лампочки ");
                room.toString(room.getLampList());
                System.out.print(")\n  ");
            } else System.out.print(")\n  ");

            System.out.print("Площадь = " + room.getAreaRoom() + " м^2 (");
            if (!room.getFurnitureList().isEmpty()) {
                double notFreeAreaRoom = room.getNotFreeAreaRoom();
                System.out.print("занято " +
                        notFreeAreaRoom + " м^2, гарантированно свободно " +
                        room.getFreeAreaRoom() + " м^2 или " +
                        (int)(100 * (room.getAreaRoom()-notFreeAreaRoom) / room.getAreaRoom()) + "% площади)\n  ");
            } else System.out.print("свободно 100%)\n  ");

            if (!room.getFurnitureList().isEmpty()) {
                System.out.print("Мебель:\n   ");
                room.toString(room.getFurnitureList());
            } else System.out.println("Мебели нет");

        }
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
