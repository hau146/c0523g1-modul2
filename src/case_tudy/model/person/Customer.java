package case_tudy.model.person;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeCustomer;
    private String addressCustomer;
    private static final long serialVersionUID = -6002711352792590208L;

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
    public Customer(String name, LocalDate dateBirth, String sex, String numberPhone, String numberCMND, String email, String typeCustomer, String addressCustomer) {
        super(name, dateBirth, sex, numberPhone, numberCMND, email);
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

    public String getInfoCVSCustomer() {
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
                ", typeCustomer='" + typeCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
