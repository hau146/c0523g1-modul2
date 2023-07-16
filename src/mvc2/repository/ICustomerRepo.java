package mvc2.repository;

import mvc2.model.Customer;

public interface ICustomerRepo {
    Customer[] findAll();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void searchCustomer(String name);
}
