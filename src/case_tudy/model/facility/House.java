package case_tudy.model.facility;

public class House extends Facility {
    private String serviceFree;

    public House() {
    }

    public House(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public House(String idService, String nameService, double areaResort, int numberPerson, int priceService, String dateHire, String serviceFree) {
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
        return "House{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
