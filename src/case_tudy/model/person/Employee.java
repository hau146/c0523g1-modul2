package case_tudy.model.person;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee extends Person {
    private String levelEmployee; //trình độ
    private String locationEmployee; //vị trí
    private int wageEmployee; //lương
    private static final long serialVersionUID = -6L;



    public Employee(String levelEmployee, String locationEmployee, int wageEmployee) {
        this.levelEmployee = levelEmployee;
        this.locationEmployee = locationEmployee;
        this.wageEmployee = wageEmployee;
    }

    public Employee(String id, String name, LocalDate dateBirth, String sex, String numberPhone, String numberCMND, String email, String levelEmployee, String locationEmployee, int wageEmployee) {
        super(id, name, dateBirth, sex,numberPhone, numberCMND, email);
        this.levelEmployee = levelEmployee;
        this.locationEmployee = locationEmployee;
        this.wageEmployee = wageEmployee;
    }
    public Employee(String name, LocalDate dateBirth, String sex, String numberPhone, String numberCMND, String email, String levelEmployee, String locationEmployee, int wageEmployee) {
        super(name, dateBirth, sex,numberPhone, numberCMND, email);
        this.levelEmployee = levelEmployee;
        this.locationEmployee = locationEmployee;
        this.wageEmployee = wageEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getLocationEmployee() {
        return locationEmployee;
    }

    public void setLocationEmployee(String locationEmployee) {
        this.locationEmployee = locationEmployee;
    }

    public int getWageEmployee() {
        return wageEmployee;
    }

    public void setWageEmployee(int wageEmployee) {
        this.wageEmployee = wageEmployee;
    }

    public String getInfoCVSEmployee() {
        return super.getInfoCVS() + this.levelEmployee + "," + this.locationEmployee + "," + this.wageEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" + "idEmployee=" + this.getId() +
                ", nameEmployee='" + this.getName() + '\'' +
                ", dateBirthEmployee=" + this.getDateBirth() +
                ", sexEmployee='" + this.getSex() + '\'' +
                ", numberPhone='" + this.getNumberPhone() + '\'' +
                ", numberCMNDEmployee=" + this.getNumberCMND() +
                ", emailEmployee='" + this.getEmail() + '\'' +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", locationEmployee='" + locationEmployee + '\'' +
                ", wageEmployee=" + wageEmployee +
                '}';
    }
}
