package case_tudy.controller;

import case_tudy.service.booking_service.BookingService;
import case_tudy.service.booking_service.IBookingService;
import case_tudy.service.contract_service.ContractService;
import case_tudy.service.contract_service.IContractService;
import case_tudy.service.customer_service.CustomerService;
import case_tudy.service.customer_service.ICustomerService;
import case_tudy.service.employee_service.EmployeeService;
import case_tudy.service.employee_service.IEmployeeService;
import case_tudy.service.facility_service.FacilityService;
import case_tudy.service.facility_service.IFacilityService;

import java.util.Scanner;

public class FurmaController {
    static IEmployeeService employeeService = new EmployeeService();
    static ICustomerService customerService = new CustomerService();
    static IBookingService bookingService = new BookingService();
    static IContractService contractService = new ContractService();
    static IFacilityService facilityService = new FacilityService();
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        int selection = 0;
        do {
            try {
                System.out.println("-----Furama resort management application-----");
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");
                System.out.println("--------------------------------");
                selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1:
                        employeeManagement(scanner);
                        break;
                    case 2:
                        customerManagement(scanner);
                        break;
                    case 3:
                        facilityManagement(scanner);
                        break;
                    case 4:
                        bookingManagement(scanner);
                        break;
                    case 5:
                        promotionManagement(scanner);
                        break;
                    case 6:
                        System.out.println("The program ends");
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter the correct number !");
            } catch (Exception e) {
                System.err.println("At fault, please load again !");
            }
        } while (true);
    }

    public static int scanner() {
        return Integer.parseInt(scanner.nextLine());
    }

    public static void employeeManagement(Scanner scanner) {
        int selectionEmployee = 0;
        do {
            System.out.println("\n----Employee Menu----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Delete employees");
            System.out.println("5. Search by name employees");
            System.out.println("6. Return main menu");
            System.out.println("---------------------------\n");
            selectionEmployee = scanner();
            switch (selectionEmployee) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    employeeService.deleteEmployee();
                    break;
                case 5:
                    employeeService.searchNameEmployee();
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    public static void customerManagement(Scanner scanner) {
        int selectionCustomer = 0;
        do {
            System.out.println("\n----Customer Menu----");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
            System.out.println("6. Return main menu");
            System.out.println("---------------------------\n");
            selectionCustomer = scanner();
            switch (selectionCustomer) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }


    public static void facilityManagement(Scanner scanner) {
        int selectionFacility = 0;
        do {
            System.out.println("\n----Facility Menu----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            System.out.println("---------------------------\n");
            selectionFacility = scanner();
            switch (selectionFacility) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    public static void bookingManagement(Scanner scanner) {
        int selectionBooking = 0;
        do {
            System.out.println("\n----Booking Menu----");
            System.out.println("1. Display list booking");
            System.out.println("2. Add new booking");
            System.out.println("3. Create new contracts"); //tạo hợp đồng mới
            System.out.println("4. Display list contracts"); //hiển thị hợp đồng
            System.out.println("5. Edit contracts"); //sửa hợp đồng
            System.out.println("6. Return main menu");
            System.out.println("---------------------------\n");
            selectionBooking = scanner();
            switch (selectionBooking) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    private static void promotionManagement(Scanner scanner) {
        int selectionPromotion = 0;
        do {
            System.out.println("\n----Promotion Menu----");
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            System.out.println("---------------------------\n");
            selectionPromotion = scanner();
            switch (selectionPromotion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }
}
