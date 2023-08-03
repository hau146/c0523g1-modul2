package case_tudy.service.employee;

import case_tudy.model.person.Employee;
import case_tudy.repository.employee.EmployeeRepository;
import case_tudy.repository.employee.IEmployeeRepository;
import case_tudy.service.format.CheckErr;
import case_tudy.service.format.CheckErrorOccurs;
import case_tudy.service.format.CheckTheSalary;
import case_tudy.service.format.Confirm;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();
    public Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmployee() {
        System.out.println("\n---Customer List---");
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
                newIdEmployee = CheckErr.checkIdNV(inputId, CheckErrorOccurs.ERR_ID, newIdEmployee, flag);

                String newNameEmployee = null;
                String inputName = "Input name employee : ";
                newNameEmployee = CheckErr.checkName(inputName, CheckErrorOccurs.ERR_NAME, newNameEmployee, flag);

                LocalDate newDateBirthEmployee = null;
                String inputDate = "Input date birth employee: ";
                newDateBirthEmployee = CheckErr.checkDateBirth(inputDate, CheckErrorOccurs.ERR_DATE, newDateBirthEmployee);

                System.out.println("Input sex employee: ");
                String newSexEmployee = scanner.nextLine();

                String newNumPhone = null;
                String inputNumPhone = "Input number phone employee : ";
                newNumPhone = CheckErr.checkNumPhone(inputNumPhone, CheckErrorOccurs.ERR_NUM_PHONE, newNumPhone, flag);

                String newNumCMND = null;
                String inputCMND = "Input number CMND employee: ";
                newNumCMND = CheckErr.checkCMND(inputCMND, CheckErrorOccurs.ERR_CMND, newNumCMND, flag);

                System.out.println("Enter employee email : ");
                String newEmailEmployee = scanner.nextLine();
                System.out.println("Input level employee:");
                String newLevelEmployee = scanner.nextLine();
                System.out.println("Input location employee:");
                String newLocationEmployee = scanner.nextLine();

                int newWageEmployee = 0;
                String inputWage = "Input wage Employee : ";
                newWageEmployee = CheckTheSalary.checkTheSalary(inputWage, CheckErrorOccurs.ERR_WAGE, newWageEmployee, flag);

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
                System.out.println("Enter the labor ID employee you want to fix");
                String editEmployee = scanner.nextLine();
                int index = employeeRepository.searchIndex(editEmployee);
                if (index == -1) {
                    System.err.println("There is no this id");
                } else {
                    boolean flag = true;
                    String editId = employeeList.get(index).getId() + " edited into : ";
                    String editIdEmployee = null;
                    editIdEmployee = CheckErr.checkIdNV(editId, CheckErrorOccurs.ERR_ID, editIdEmployee, flag);

                    String editName = employeeList.get(index).getName() + " edited into :";
                    String editNameEmployee = null;
                    editNameEmployee = CheckErr.checkName(editName, CheckErrorOccurs.ERR_NAME, editNameEmployee, flag);

                    String editDateBirth = employeeList.get(index).getDateBirth() + " edited into :";
                    LocalDate editDateEmployee = null;
                    editDateEmployee = CheckErr.checkDateBirth(editDateBirth, CheckErrorOccurs.ERR_DATE, editDateEmployee);

                    System.out.println(employeeList.get(index).getSex() + " edited into :");
                    String editSexEmployee = scanner.nextLine();

                    String editNumberPhone = employeeList.get(index).getNumberPhone() + " edited into :";
                    String editPhoneEmployee = null;
                    editPhoneEmployee = CheckErr.checkNumPhone(editNumberPhone, CheckErrorOccurs.ERR_NUM_PHONE, editPhoneEmployee, flag);

                    String editCMND = employeeList.get(index).getNumberCMND() + " edited into :";
                    String editCMNDEmployee = null;
                    editCMNDEmployee = CheckErr.checkCMND(editCMND, CheckErrorOccurs.ERR_CMND, editCMNDEmployee, flag);

                    System.out.println(employeeList.get(index).getEmail() + " edited into :");
                    String editEmailEmployee = scanner.nextLine();

                    System.out.println(employeeList.get(index).getLevelEmployee() + " edited into :");
                    String editLevelEmployee = scanner.nextLine();

                    System.out.println(employeeList.get(index).getLocationEmployee() + " edited into :");
                    String editLocaltionEmployee = scanner.nextLine();

                    String editWage = employeeList.get(index).getWageEmployee() + " edited into :";
                    int editWageEmployee = 0;
                    editWageEmployee = CheckTheSalary.checkTheSalary(editWage, CheckErrorOccurs.ERR_WAGE, editWageEmployee, flag);

                    Employee employee = new Employee(editIdEmployee, editNameEmployee, editDateEmployee, editSexEmployee, editPhoneEmployee, editCMNDEmployee, editEmailEmployee, editLevelEmployee, editLocaltionEmployee, editWageEmployee);

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
                    if (Confirm.confirm() == true) {
                        employeeRepository.deleteEmployee(index);
                        System.out.println("complete delete\n");
                    } else {
                        System.out.println("\nData will be kept the same !");
                    }
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
        System.out.println("\n--Found the staff--");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
