package case_tudy.model.facility;

import java.util.Date;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double areaResort;
    private int numberPerson;
    private int priceService;
    private String DateHire;

    public Facility() {
    }

    public Facility(String idService, String nameService, double areaResort, int numberPerson, int priceService, String dateHire) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaResort = areaResort;
        this.numberPerson = numberPerson;
        this.priceService = priceService;
        DateHire = dateHire;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaResort() {
        return areaResort;
    }

    public void setAreaResort(double areaResort) {
        this.areaResort = areaResort;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public int getPriceService() {
        return priceService;
    }

    public void setPriceService(int priceService) {
        this.priceService = priceService;
    }

    public String getDateHire() {
        return DateHire;
    }

    public void setDateHire(String dateHire) {
        DateHire = dateHire;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", areaResort=" + areaResort +
                ", numberPerson=" + numberPerson +
                ", priceService=" + priceService +
                ", DateHire='" + DateHire + '\'' +
                '}';
    }
}
