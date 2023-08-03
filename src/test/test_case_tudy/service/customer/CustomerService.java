package test.test_case_tudy.service.customer;

import case_tudy.model.person.Customer;
import case_tudy.repository.customer.CustomerRepository;
import case_tudy.repository.customer.ICustomerRepository;
import case_tudy.service.customer.ICustomerService;
import case_tudy.service.format.CheckErr;
import case_tudy.service.format.CheckErrorOccurs;
import case_tudy.service.format.CheckTypeCustomer;

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
        newIdCustomer = CheckErr.checkIdKH(inputId, CheckErrorOccurs.ERR_ID, newIdCustomer, flag);

        String newNameCustomer = null;
        String inputName = "Input name customer : ";
        newNameCustomer = CheckErr.checkName(inputName, CheckErrorOccurs.ERR_NAME, newNameCustomer, flag);

        LocalDate newDateBirthCustomer = null;
        String inputDateBirth = "Input date birth customer : : ";
        newDateBirthCustomer = CheckErr.checkDateBirth(inputDateBirth, CheckErrorOccurs.ERR_DATE, newDateBirthCustomer);

        System.out.println("Input sex customer : ");
        String newSexCustomer = scanner.nextLine();

        String newPhoneCustomer = null;
        String inputNumPhone = "Input number phone customer : ";
        newPhoneCustomer = CheckErr.checkNumPhone(inputNumPhone, CheckErrorOccurs.ERR_NUM_PHONE, newPhoneCustomer, flag);

        String newCMNDCustomer = null;
        String inputCMND = "Input number CMND customer : ";
        newCMNDCustomer = CheckErr.checkCMND(inputCMND, CheckErrorOccurs.ERR_CMND, newCMNDCustomer, flag);

        System.out.println("Enter customer email : ");
        String newEmailCustomer = scanner.nextLine();

        String newTypeCustomer = null;
        String inputType = "Enter the type of customer (Diamond, Platinum, Gold, Silver, Member) : ";
        newTypeCustomer = CheckTypeCustomer.checkType(inputType, CheckErrorOccurs.ERR_TYPE_CUSTOMER, newTypeCustomer, flag);

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
            editId = CheckErr.checkIdKH(inputId, CheckErrorOccurs.ERR_ID, editId, flag);

            String inputName = customerList.get(index).getName() + " edited into : ";
            String editName = null;
            editName = CheckErr.checkName(inputName, CheckErrorOccurs.ERR_NAME, editName, flag);

            String inputDateBirth = customerList.get(index).getDateBirth() + " edited into : ";
            LocalDate editDateBirth = null;
            editDateBirth = CheckErr.checkDateBirth(inputDateBirth, CheckErrorOccurs.ERR_DATE, editDateBirth);

            System.out.println(customerList.get(index).getSex() + " edited into :");
            String editSex = scanner.nextLine();

            String inputPhone = customerList.get(index).getNumberPhone() + " edited into : ";
            String editPhone = null;
            editPhone = CheckErr.checkNumPhone(inputPhone, CheckErrorOccurs.ERR_NUM_PHONE, editPhone, flag);

            String inputCMND = customerList.get(index).getNumberCMND() + " edited into :";
            String editCMND = null;
            editCMND = CheckErr.checkCMND(inputCMND, CheckErrorOccurs.ERR_CMND, editCMND, flag);

            System.out.println(customerList.get(index).getEmail() + " edited into :");
            String editEmail = scanner.nextLine();

            String inputType = customerList.get(index).getTypeCustomer() + " edited into (Diamond, Platinum, Gold, Silver, Member) : ";
            String editType = null;
            editType = CheckTypeCustomer.checkType(inputType, CheckErrorOccurs.ERR_TYPE_CUSTOMER, editType, flag);


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
