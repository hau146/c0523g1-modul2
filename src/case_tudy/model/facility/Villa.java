package case_tudy.model.facility;

public class Villa extends Facility {
    private String roomStandardVilla; //tiêu chuẩn phòng
    private double areaPool; //hồ bơi
    private int numberFloorsVilla; //số tầng

    public Villa() {
    }

    public Villa(String roomStandard, double areaPool, int numberFloors) {
        this.roomStandardVilla = roomStandard;
        this.areaPool = areaPool;
        this.numberFloorsVilla = numberFloors;
    }

    public Villa(String idService, String nameService, double areaResort, int numberPerson, int priceService, String dateHire, String roomStandard, double areaPool, int numberFloors) {
        super(idService, nameService, areaResort, numberPerson, priceService, dateHire);
        this.roomStandardVilla = roomStandard;
        this.areaPool = areaPool;
        this.numberFloorsVilla = numberFloors;
    }

    public String getRoomStandardVilla() {
        return roomStandardVilla;
    }

    public void setRoomStandardVilla(String roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloorsVilla() {
        return numberFloorsVilla;
    }

    public void setNumberFloorsVilla(int numberFloorsVilla) {
        this.numberFloorsVilla = numberFloorsVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandardVilla + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloors=" + numberFloorsVilla +
                '}';
    }
}
