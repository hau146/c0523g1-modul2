package mvc2.repository;

import mvc2.model.Customer;

public class CustomerRepo implements ICustomerRepo {
    private static Customer[] customersList;
    private static int size = 0;


    static {
        size = 5;
        customersList = new Customer[size*size];
        customersList[0] = new Customer(1, "Sơn Tùng", 23, "khách VIP");
        customersList[1] = new Customer(2, "Ngọc Nhi", 20, "khách du lịch");
        customersList[2] = new Customer(3, "Jack", 27, "khách hàng");
        customersList[3] = new Customer(4, "Lê Đình Vũ", 26, "khách mời");
        customersList[4] = new Customer(5, "Liên", 26, "khách quan");
    }

    @Override
    public Customer[] findAll() {
        Customer[] customers = new Customer[size];
        for (int i = 0; i < size ; i++) {
            customers[i] = customersList[i];
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println(customersList.length);
        customersList[size] = customer;
        size++;
    }

    @Override
    public void deleteCustomer(int id) {
        for (int i = 0; i < customersList.length; i++) {
            if (id == customersList[i].getId()) {
                for (int j = i; j < customersList.length - 1; j++) {
                    customersList[j] = customersList[j + 1];
                }
                customersList[customersList.length - 1] = null;
                size--;
                break;
            }
        }
    }

    @Override
    public void searchCustomer(String name) {
        for (int i = 0; i < size; i++) {
            if (customersList[i].getName().contains(name)) {
                System.out.println(customersList[i]);
            }
        }
    }
}
