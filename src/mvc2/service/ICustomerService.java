package mvc2.service;

import mvc2.model.Customer;

public interface ICustomerService {
    Customer[] findAll();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void searchCustomer(String name);
}
