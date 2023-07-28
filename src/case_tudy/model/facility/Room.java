package case_tudy.model.facility;

public class Room extends Facility {
    private String roomStandardRoom;
    private int numberFloorsRoom;

    public Room() {
    }

    public Room(String roomStandardRoom, int numberFloorsRoom) {
        this.roomStandardRoom = roomStandardRoom;
        this.numberFloorsRoom = numberFloorsRoom;
    }

    public Room(String idService, String nameService, double areaResort, int numberPerson, int priceService, String dateHire, String roomStandardRoom, int numberFloorsRoom) {
        super(idService, nameService, areaResort, numberPerson, priceService, dateHire);
        this.roomStandardRoom = roomStandardRoom;
        this.numberFloorsRoom = numberFloorsRoom;
    }

    public String getRoomStandardRoom() {
        return roomStandardRoom;
    }

    public void setRoomStandardRoom(String roomStandardRoom) {
        this.roomStandardRoom = roomStandardRoom;
    }

    public int getNumberFloorsRoom() {
        return numberFloorsRoom;
    }

    public void setNumberFloorsRoom(int numberFloorsRoom) {
        this.numberFloorsRoom = numberFloorsRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomStandardRoom='" + roomStandardRoom + '\'' +
                ", numberFloorsRoom=" + numberFloorsRoom +
                '}';
    }
}
