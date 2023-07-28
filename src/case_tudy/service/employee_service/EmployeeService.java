package case_tudy.service.employee_service;

import case_tudy.model.person.Employee;
import case_tudy.repository.employee_repository.EmployeeRepository;
import case_tudy.repository.employee_repository.IEmployeeRepository;
import case_tudy.service.regex.CheckRegex;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmployee() {
        try {
            List<Employee> employees = employeeRepository.showAllEmployee();
            if (employees.size() == 0) {
                throw new IndexOutOfBoundsException();
            }
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } catch (IndexOutOfBoundsException i) {
            System.err.println("There is no employee !");
        }
    }

    @Override
    public void addEmployee() {
        boolean flag = true;
        while (true) {
            try {
                String newIdEmployee;
                do {
                    System.out.println("Enter the ID of the staff with the format (NV-YYYY) : ");
                    newIdEmployee = scanner.nextLine();
                    flag = CheckRegex.checkIdNV(newIdEmployee);
                    if (!flag) {
                        System.err.println("\nThe format is not in accordance with the request to re -enter");
                    }
                } while (!flag);
                String newNameEmployee;
                do {
                    System.out.println("Input name employee : ");
                    newNameEmployee = scanner.nextLine();
                    flag = CheckRegex.checkName(newNameEmployee);
                    if (!flag) {
                        System.err.println("\nThe name must capitalize the first letter");
                    }
                } while (!flag);
                LocalDate newDateBirthEmployee;
                do {
                    System.out.println("Input date birth employee: ");
                    newDateBirthEmployee = LocalDate.parse(scanner.nextLine());
                    if (LocalDate.now().compareTo(newDateBirthEmployee) < 18) {
                        System.err.println("must be greater than or equal to 18");
                    }
                } while (LocalDate.now().compareTo(newDateBirthEmployee) < 18);
                System.out.println("Input sex employee: ");
                String newSexEmployee = scanner.nextLine();
                String newNumPhone;
                do {
                    System.out.println("Input number phone employee : ");
                    newNumPhone = scanner.nextLine();
                    flag = CheckRegex.checkNumPhone(newNumPhone);
                    if (!flag) {
                        System.err.println("The phone number must be 10 numbers");
                    }
                } while (!flag);

                System.out.println("Input number CMND: ");
                String newNumCMND;
                do {
                    newNumCMND = scanner.nextLine();
                    System.out.println("Input email: ");
                    if (!flag) {
                        System.err.println("Your ID must be from 9 or 12 numbers");
                    }
                } while (!flag);
                String newEmailEmployee = scanner.nextLine();
                System.out.println("Input level employee:");
                String newLevelEmployee = scanner.nextLine();
                System.out.println("Input location employee:");
                String newLocationEmployee = scanner.nextLine();
                int newWageEmployee;
                do {
                    newWageEmployee = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input wage Employee:");
                    if (newWageEmployee <= 0) {
                        System.out.println("Salary must be bigger\n");
                    }
                } while (newWageEmployee <= 0);
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
                    System.out.println(employeeList.get(index).getName() + " edited into :");
                    String editNameEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getDateBirth() + " edited into :");
                    LocalDate editDateEmployee = LocalDate.parse(scanner.nextLine());
                    System.out.println(employeeList.get(index).getSex() + " edited into :");
                    String editSexEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getNumberPhone() + " edited into :");
                    String editPhoneEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getNumberCMND() + " edited into :");
                    String editCMNDEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getEmail() + " edited into :");
                    String editEmailEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getLevelEmployee() + " edited into :");
                    String editLevelEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getLocationEmployee() + " edited into :");
                    String editLocaltionEmployee = scanner.nextLine();
                    System.out.println(employeeList.get(index).getWageEmployee() + " edited into :");
                    int editWageEmployee = Integer.parseInt(scanner.nextLine());
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
