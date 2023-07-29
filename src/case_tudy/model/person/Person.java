package case_tudy.model.person;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Person implements Serializable {
    private String id;
    private String name;
    private LocalDate dateBirth;
    private String sex;
    private String numberPhone;
    private String numberCMND;
    private String email;
    private static final long serialVersionUID = 3236463905116936961L;

    public Person() {
    }

    public Person(String id, String name, LocalDate dateBirth, String sex, String numberPhone, String numberCMND, String email) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.sex = sex;
        this.numberPhone = numberPhone;
        this.numberCMND = numberCMND;
        this.email = email;
    }

    public Person(String name, LocalDate dateBirth, String sex, String numberPhone, String numberCMND, String email) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.sex = sex;
        this.numberPhone = numberPhone;
        this.numberCMND = numberCMND;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfoCVS() {
        return this.id + "," + this.name + "," + this.dateBirth + "," + this.sex + "," + this.numberPhone + "," + this.numberCMND + "," + this.email + ",";
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", numberCMND='" + numberCMND + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
