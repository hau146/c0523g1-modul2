package case_tudy.service.customer_service;

import case_tudy.model.person.Customer;
import case_tudy.repository.customer_repository.CustomerRepository;
import case_tudy.repository.customer_repository.ICustomerRepository;
import case_tudy.service.format.CheckErr;
import case_tudy.service.format.CheckRegex;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCustomer() {
        List<Customer> customerList = customerRepository.showAllCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        boolean flag = true;
        String newIdCustomer = null;
        String inputId = "Enter the ID of the staff with the format (KH-YYYY) : ";
        newIdCustomer = CheckRegex.checkIdKH(inputId, CheckErr.ERR_ID, newIdCustomer, flag);

        String newNameCustomer = null;
        String inputName = "Input name customer : ";
        newNameCustomer = CheckRegex.checkName(inputName, CheckErr.ERR_NAME, newNameCustomer, flag);

        LocalDate newDateBirthCustomer = null;
        String inputDateBirth = "Input date birth customer : : ";
        newDateBirthCustomer = CheckRegex.checkDateBirth(inputDateBirth, CheckErr.ERR_DATE, newDateBirthCustomer, flag);

        System.out.println("Input sex customer : ");
        String newSexCustomer = scanner.nextLine();

        String newPhoneCustomer = null;
        String inputNumPhone = "Input number phone customer : ";
        newPhoneCustomer = CheckRegex.checkNumPhone(inputNumPhone, CheckErr.ERR_NUM_PHONE, newPhoneCustomer, flag);

        String newCMNDCustomer = null;
        String inputCMND = "Input number CMND customer : ";
        newCMNDCustomer = CheckRegex.checkCMND(inputCMND, CheckErr.ERR_CMND, newCMNDCustomer, flag);

        System.out.println("Enter customer email : ");
        String newEmailCustomer = scanner.nextLine();

        System.out.println("Enter the type of customer : ");
        String newTypeCustomer = scanner.nextLine();

        System.out.println("Enter the customer address : ");
        String newAddress = scanner.nextLine();

        Customer customer = new Customer(newIdCustomer, newNameCustomer, newDateBirthCustomer, newSexCustomer, newPhoneCustomer, newCMNDCustomer, newEmailCustomer, newTypeCustomer, newAddress);
        customerRepository.addCustomer(customer);
        System.out.println("Add Complete\n");
    }

    @Override
    public void editCustomer() {
        List<Customer> customerList = customerRepository.showAllCustomer();
        System.out.println("Enter the labor ID customer you want to fix");
        String editCustomer = scanner.nextLine();
        int index = customerRepository.searchIndex(editCustomer);
        if (index == -1) {
            System.err.println("There is no this id");
        } else {
            boolean flag = true;
            String inputId = customerList.get(index).getId() + " edited into : ";
            String editId = null;
            editId = CheckRegex.checkIdKH(inputId, CheckErr.ERR_ID, editId, flag);

            String inputName = customerList.get(index).getName() + " edited into : ";
            String editName = null;
            editName = CheckRegex.checkName(inputName, CheckErr.ERR_NAME, editName, flag);

            String inputDateBirth = customerList.get(index).getDateBirth() + " edited into : ";
            LocalDate editDateBirth = null;
            editDateBirth = CheckRegex.checkDateBirth(inputDateBirth, CheckErr.ERR_DATE, editDateBirth, flag);

            System.out.println(customerList.get(index).getSex() + " edited into :");
            String editSex = scanner.nextLine();

            String inputPhone = customerList.get(index).getNumberPhone() + " edited into : ";
            String editPhone = null;
            editPhone = CheckRegex.checkNumPhone(inputPhone, CheckErr.ERR_NUM_PHONE, editPhone, flag);

            String inputCMND = customerList.get(index).getNumberCMND() + " edited into :";
            String editCMND = null;
            editCMND = CheckRegex.checkCMND(inputCMND, CheckErr.ERR_CMND, editCMND, flag);

            System.out.println(customerList.get(index).getEmail() + " edited into :");
            String editEmail = scanner.nextLine();

            System.out.println(customerList.get(index).getTypeCustomer() + " edited into : ");
            String editType = scanner.nextLine();

            System.out.println(customerList.get(index).getAddressCustomer() + " edited into : ");
            String editAddress = scanner.nextLine();

            Customer customer = new Customer(editId, editName, editDateBirth, editSex, editPhone, editCMND, editEmail, editType, editAddress);
            customerRepository.editCustomer(index, customer);
            System.out.println("--complete edit--\n");
        }
    }

    @Override
    public void deleteCustomer() {
        while (true) {
            try {
                System.out.println("Enter the employee ID you want to delete");
                String deleIdCustomer = scanner.nextLine();
                int index = customerRepository.searchIndex(deleIdCustomer);
                if (index == -1) {
                    System.err.println("There is no this id\n");
                } else {
                    customerRepository.deleteCustomer(index);
                    System.out.println("---Complete delete---\n");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter the correct id\n");
            }
        }
    }

    @Override
    public void searchCustomer() {
        System.out.println("Enter the name of the customer you want to find : ");
        String searchByName = scanner.nextLine();
        List<Customer> customerList = customerRepository.searchNameCustomer(searchByName);
        System.out.println("\n--Find the following customers--");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
