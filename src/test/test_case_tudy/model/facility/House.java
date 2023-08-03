package test.test_case_tudy.model.facility;

import case_tudy.model.facility.Facility;

public class House extends Facility {
    private String roomStandardHouse;
    private int numberFloorsHouse;

    public House() {
    }

    public House(String roomStandardHouse, int numberFloorsHouse) {
        this.roomStandardHouse = roomStandardHouse;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public House(String idService, String nameService, double areaResort, int numberPerson, int priceService, String dateHire, String roomStandardHouse, int numberFloorsHouse) {
        super(idService, nameService, areaResort, numberPerson, priceService, dateHire);
        this.roomStandardHouse = roomStandardHouse;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public int getNumberFloorsHouse() {
        return numberFloorsHouse;
    }

    public void setNumberFloorsHouse(int numberFloorsHouse) {
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "idHouse=" + this.getIdService() +
                ", nameHouse='" + this.getNameService() + '\'' +
                ", areaHouse=" + this.getAreaResort() +
                ", renterHouse=" + this.getNumberPerson() +
                ", priceHouse=" + this.getPriceService() +
                ", DateHouse='" + this.getDateHire() + '\'' +
                "roomStandardHouse='" + roomStandardHouse + '\'' +
                ", numberFloorsHouse=" + numberFloorsHouse +
                '}';
    }
}
