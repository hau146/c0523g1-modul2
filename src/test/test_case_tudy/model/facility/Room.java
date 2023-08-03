package test.test_case_tudy.model.facility;

import case_tudy.model.facility.Facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String idService, String nameService, double areaResort, int numberPerson, int priceService, String dateHire, String serviceFree) {
        super(idService, nameService, areaResort, numberPerson, priceService, dateHire);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom=" + this.getIdService() +
                ", nameRoom='" + this.getNameService() + '\'' +
                ", areaRoom=" + this.getAreaResort() +
                ", renterRoom=" + this.getNumberPerson() +
                ", priceRoom=" + this.getPriceService() +
                ", DateHire='" + this.getDateHire() + '\'' +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
