package case_tudy.controller;

import case_tudy.service.booking.BookingService;
import case_tudy.service.booking.IBookingService;
import case_tudy.service.contract.ContractService;
import case_tudy.service.contract.IContractService;
import case_tudy.service.customer.CustomerService;
import case_tudy.service.customer.ICustomerService;
import case_tudy.service.employee.EmployeeService;
import case_tudy.service.employee.IEmployeeService;
import case_tudy.service.facility.FacilityService;
import case_tudy.service.facility.IFacilityService;

import java.util.Scanner;
public class FurmaController{
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
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        facilityManagement();
                        break;
                    case 4:
                        bookingManagement();
                        break;
                    case 5:
                        promotionManagement();
                        break;
                    case 6:
                        System.out.println("The program ends");
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter the correct number !");
//            } catch (Exception e) {
//                System.err.println("At fault, please load again !");
            }
        } while (true);
    }




    public static void employeeManagement() {
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
            selectionEmployee = Integer.parseInt(scanner.nextLine());
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

    public static void customerManagement() {
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
            selectionCustomer = Integer.parseInt(scanner.nextLine());
            switch (selectionCustomer) {
                case 1:
                    customerService.displayCustomer();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    customerService.deleteCustomer();
                    break;
                case 5:
                    customerService.searchCustomer();
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }


    public static void facilityManagement() {
        int selectionFacility = 0;
        do {
            System.out.println("\n----Facility Menu----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            System.out.println("---------------------------\n");
            selectionFacility = Integer.parseInt(scanner.nextLine());
            switch (selectionFacility) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    menuFacility();
                    break;
                case 3:
                    facilityService.finAllMaintenance();
                    break;
                case 4:
                    facilityService.deleteFacility();
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }
    public static void menuFacility() {
        int selection = 0;
        do {
            System.out.println("\n----Service Falicity----");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to Menu");
            System.out.println("---------------------------\n");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    facilityService.addVilla();
                    break;
                case 2:
                    facilityService.addHouse();
                    break;
                case 3:
                    facilityService.addRoom();
                    break;
                case 4:
                    facilityManagement();
                    break;
            }
        } while (true);
    }


    public static void bookingManagement() {
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
            selectionBooking = Integer.parseInt(scanner.nextLine());
            switch (selectionBooking) {
                case 1:
                    bookingService.displayBooking();
                    break;
                case 2:
                    bookingService.addBooking();
                    break;
                case 3:
                    bookingService.newContracts();
                    break;
                case 4:
                    bookingService.displayContract();
                    break;
                case 5:
                    bookingService.editContracts();
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    private static void promotionManagement() {
        int selectionPromotion = 0;
        do {
            System.out.println("\n----Promotion Menu----");
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            System.out.println("---------------------------\n");
            selectionPromotion = Integer.parseInt(scanner.nextLine());
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
