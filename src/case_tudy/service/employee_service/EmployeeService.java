package case_tudy.service.employee_service;

import case_tudy.model.person.Employee;
import case_tudy.repository.employee_repository.EmployeeRepository;
import case_tudy.repository.employee_repository.IEmployeeRepository;
import case_tudy.service.format.CheckRegex;
import case_tudy.service.format.CheckTheSalary;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String ERR_NAME = "\nThe name must capitalize the first letter";
    public static final String ERR_DATE = "must be greater than or equal to 18";
    public static final String ERR_NUM_PHONE = "The phone number must be 10 numbers";
    public static final String ERR_CMND = "Your ID must be from 9 or 12 numbers";
    public static final String ERR_WAGE = "\nSalary must be bigger";
    public static final String ERR_ID = "\nThe format is not in accordance with the request to re -enter";
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmployee() {
        List<Employee> employees = employeeRepository.showAllEmployee();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        boolean flag = true;
        while (true) {
            try {
                String newIdEmployee = null;
                String inputId = "Enter the ID of the staff with the format (NV-YYYY) : ";
                newIdEmployee = CheckRegex.checkIdNV(inputId, ERR_ID, newIdEmployee, flag);

                String newNameEmployee = null;
                String inputName = "Input name employee : ";
                newNameEmployee = CheckRegex.checkName(inputName, ERR_NAME, newNameEmployee, flag);

                LocalDate newDateBirthEmployee = null;
                String inputDate = "Input date birth employee: ";
                newDateBirthEmployee = CheckRegex.checkDateBirth(inputDate, ERR_DATE, newDateBirthEmployee, flag);

                System.out.println("Input sex employee: ");
                String newSexEmployee = scanner.nextLine();

                String newNumPhone = null;
                String inputNumPhone = "Input number phone employee : ";
                newNumPhone = CheckRegex.checkNumPhone(inputNumPhone, ERR_NUM_PHONE, newNumPhone, flag);

                String newNumCMND = null;
                String inputCMND = "Input number CMND: ";
                newNumCMND = CheckRegex.checkCMND(inputCMND, ERR_CMND, newNumCMND, flag);

                System.out.println("Enter employee email : ");
                String newEmailEmployee = scanner.nextLine();
                System.out.println("Input level employee:");
                String newLevelEmployee = scanner.nextLine();
                System.out.println("Input location employee:");
                String newLocationEmployee = scanner.nextLine();

                int newWageEmployee = 0;
                String inputWage = "Input wage Employee : ";
                newWageEmployee = CheckTheSalary.checkTheSalary(inputWage, ERR_WAGE, newWageEmployee, flag);

                Employee employee = new Employee(newIdEmployee, newNameEmployee, newDateBirthEmployee, newSexEmployee, newNumPhone, newNumCMND, newEmailEmployee, newLevelEmployee, newLocationEmployee, newWageEmployee);
                employeeRepository.addEmployee(employee);
                System.out.println("\ncomplete");
                break;
            } catch (NumberFormatException n) {
                System.err.println("Please enter the number please\n");
            }
        }
    }

    @Override
    public void editEmployee() {
        while (true) {
            try {
                List<Employee> employeeList = employeeRepository.showAllEmployee();
                System.out.println("Enter the labor ID you want to fix");
                String editEmployee = scanner.nextLine();
                int index = employeeRepository.searchIndex(editEmployee);
                if (index == -1) {
                    System.err.println("There is no this id");
                } else {
                    boolean flag = true;
                    String editName = employeeList.get(index).getName() + " edited into :";
                    String editNameEmployee = null;
                    editNameEmployee = CheckRegex.checkName(editName, ERR_NAME, editNameEmployee, flag);

                    String editDateBirth = employeeList.get(index).getDateBirth() + " edited into :";
                    LocalDate editDateEmployee = null;
                    editDateEmployee = CheckRegex.checkDateBirth(editDateBirth, ERR_DATE, editDateEmployee, flag);

                    System.out.println(employeeList.get(index).getSex() + " edited into :");
                    String editSexEmployee = scanner.nextLine();

                    String editNumberPhone = employeeList.get(index).getNumberPhone() + " edited into :";
                    String editPhoneEmployee = null;
                    editPhoneEmployee = CheckRegex.checkNumPhone(editNumberPhone, ERR_NUM_PHONE, editPhoneEmployee, flag);

                    String editCMND = employeeList.get(index).getNumberCMND() + " edited into :";
                    String editCMNDEmployee = null;
                    editCMNDEmployee = CheckRegex.checkCMND(editCMND, ERR_CMND, editCMNDEmployee, flag);

                    System.out.println(employeeList.get(index).getEmail() + " edited into :");
                    String editEmailEmployee = scanner.nextLine();

                    System.out.println(employeeList.get(index).getLevelEmployee() + " edited into :");
                    String editLevelEmployee = scanner.nextLine();

                    System.out.println(employeeList.get(index).getLocationEmployee() + " edited into :");
                    String editLocaltionEmployee = scanner.nextLine();

                    String editWage = employeeList.get(index).getWageEmployee() + " edited into :";
                    int editWageEmployee = 0;
                    editWageEmployee = CheckTheSalary.checkTheSalary(editWage, ERR_WAGE, editWageEmployee, flag);

                    Employee employee = new Employee(editNameEmployee, editDateEmployee, editSexEmployee, editPhoneEmployee, editCMNDEmployee, editEmailEmployee, editLevelEmployee, editLocaltionEmployee, editWageEmployee);
                    employeeRepository.editEmployee(index, employee);
                    System.out.println("\nsuccessful repair");
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter the correct id\n");
            }
        }
    }

    @Override
    public void deleteEmployee() {
        while (true) {
            try {
                System.out.println("Enter the employee ID you want to delete");
                String deleIdEmployee = scanner.nextLine();
                int index = employeeRepository.searchIndex(deleIdEmployee);
                if (index == -1) {
                    System.err.println("There is no this id");
                } else {
                    employeeRepository.deleteEmployee(index);
                    System.out.println("complete delete\n");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter the correct id\n");
            }
        }
    }

    @Override
    public void searchNameEmployee() {
        System.out.println("Enter the name of the employee you want to find : ");
        String searchNameEmployee = scanner.nextLine();
        List<Employee> employeeList = employeeRepository.searchNameEmployee(searchNameEmployee);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
