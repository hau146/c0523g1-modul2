package mvc2.controller;

import mvc2.model.Customer;
import mvc2.service.CumstomerService;
import mvc2.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CumstomerService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int click = 0;
        do {
            System.out.println();
            System.out.println("Danh sách khách hàng");
            System.out.println("1. xem danh sách ");
            System.out.println("2. thêm khách hàng");
            System.out.println("3. xóa khách hàng");
            System.out.println("4. tìm khách hàng");
            System.out.println("5. Exit");
            click = Integer.parseInt(scanner.nextLine());
            switch (click) {
                case 1:
                    Customer[] customers = customerService.findAll();
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào id");
                    int idCustomer = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tuổi khách");
                    int ageCustomer = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tên khách");
                    String nameCustomer = scanner.nextLine();
                    System.out.println("Nhập vào loại khách");
                    String typeCustomer = scanner.nextLine();
                    Customer customer = new Customer(idCustomer, nameCustomer, ageCustomer, typeCustomer);
                    customerService.addCustomer(customer);
                    System.out.println("Đã thêm xong");
                    break;
                case 4:
                    System.out.println("Nhập vào tên khách muốn tìm");
                    String name = scanner.nextLine();
                    customerService.searchCustomer(name);
                    break;
            }
        } while (true);
    }
}
