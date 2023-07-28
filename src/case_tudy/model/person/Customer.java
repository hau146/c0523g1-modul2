package case_tudy.model.person;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer(String typeCustomer, String addressCustomer) {
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
    }

    public Customer(String id, String name, LocalDate dateBirth, String sex, String numberPhone, String numberCMND, String email, String typeCustomer, String addressCustomer) {
        super(id, name, dateBirth, sex, numberPhone, numberCMND, email);
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getInfoCVS(String id, String name, String dateBirth, String sex, String numberCMND, String email) {
        return super.getInfoCVS() + this.typeCustomer + "," + this.addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + this.getId() + '\'' +
                ", nameCustomer='" + this.getName() + '\'' +
                ", dateBirthCustomer='" + this.getDateBirth() + '\'' +
                ", sexCustomer='" + this.getSex() + '\'' +
                ", numberPhoneCustomer='" + this.getNumberPhone() + '\'' +
                ", numberCMNDCustomer='" + this.getNumberCMND() + '\'' +
                ", emailCustomer='" + this.getEmail() + '\'' +
                "typeCustomer='" + typeCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
