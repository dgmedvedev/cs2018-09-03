package lesson9.building;

public class Building {
    private Room room;
    private String titleBuilding;

    Building(String titleBuilding){
        this.titleBuilding = titleBuilding;
    }

    void addRoom(String titleRoom, double area, int windows){
        room = new Room(titleRoom,area,windows);
        room.getRoomList().add(room);
    }

    public Room getRoom(String titleRoom) {
        try {
            for(Room r : room.getRoomList())
                if(r.getTitleRoom().equals(titleRoom))
                    return r;
                else throw new Exception();
        }catch (Exception ex){
            System.err.println("Такой комнаты не существует");
        }return new Room(null,0,0);
    }

    public String getTitleBuilding() {
        return titleBuilding;
    }
}
