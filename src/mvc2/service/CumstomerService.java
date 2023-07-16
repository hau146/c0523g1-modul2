package mvc2.service;

import mvc.service.ICilentService;
import mvc2.model.Customer;
import mvc2.repository.CustomerRepo;
import mvc2.repository.ICustomerRepo;

public class CumstomerService implements ICustomerService {
    private ICustomerRepo customerRepo = new CustomerRepo();
    @Override
    public Customer[] findAll() {
        return customerRepo.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepo.addCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepo.deleteCustomer(id);
    }

    @Override
    public void searchCustomer(String name) {
        customerRepo.searchCustomer(name);
    }
}
