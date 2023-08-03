package test.test_case_tudy.repository.customer;

import case_tudy.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> showAllCustomer();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
    void deleteCustomer(int indexCustomer);
    List<Customer> searchNameCustomer(String nameCustomer);
    int searchIndex(String id);
}
