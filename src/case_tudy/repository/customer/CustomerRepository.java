package case_tudy.repository.customer;

import case_tudy.model.person.Customer;
import case_tudy.ulti.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String FILE_CUSTOMER = "D:\\c0523g1-modul2\\src\\case_tudy\\data\\customer_data\\customer.cvs";

    private List<String> switchToString(List<Customer> customerList){
        List<String> stringList = new ArrayList<>();
        for (Customer customer:customerList) {
            stringList.add(customer.getInfoCVSCustomer());
        }
        return stringList;
    }
    @Override
    public List<Customer> showAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readToFileCVS(FILE_CUSTOMER);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Customer customer = new Customer(array[0], array[1], LocalDate.parse(array[2]), array[3], array[4], array[5], array[6],array[7],array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoCVSCustomer());
        ReadAndWrite.writeToFileCVS(FILE_CUSTOMER, stringList, true);
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        List<Customer> customerList = this.showAllCustomer();
        customerList.set(index,customer);
        ReadAndWrite.writeToFileCVS(FILE_CUSTOMER, switchToString(customerList),false);
    }

    @Override
    public void deleteCustomer(int indexCustomer) {
        List<Customer> customerList = this.showAllCustomer();
        customerList.remove(indexCustomer);
        switchToString(customerList);
        ReadAndWrite.writeToFileCVS(FILE_CUSTOMER,switchToString(customerList),false);
    }

    @Override
    public List<Customer> searchNameCustomer(String nameCustomer) {
        List<Customer> customerList = this.showAllCustomer();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < customers.size() ; i++) {
            if(customerList.get(i).getName().contains(nameCustomer)){
                customers.add(customers.get(i));
            }
        }
        return customers;
    }

    @Override
    public int searchIndex(String id) {
        List<Customer> customerList = this.showAllCustomer();
        for (int i = 0; i < customerList.size() ; i++) {
            if (customerList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
