package mvc.controller;

import mvc.model.ClientModel;
import mvc.service.ClientSeriveImpl;
import mvc.service.ICilentService;

import java.util.Scanner;

public class ClientController {
    private static ICilentService cilentService = new ClientSeriveImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int click = 0;
        do {
            System.out.println();
            System.out.println("---Danh sách quản lí khách hàng---");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Tìm kiếm khách hàng");
            System.out.println("5. Exit");
            System.out.println("Nhập vào những số trên để thực hiện chức năng");
            click = Integer.parseInt(scanner.nextLine());
            switch (click) {
                case 1:
                    ClientModel[] controllers = cilentService.finAll();
                    for (ClientModel controller : controllers) {
                        System.out.println(controller);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào id");
                    int idClient = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tuổi khách");
                    int ageClient = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tên khách");
                    String nameClient = scanner.nextLine();
                    System.out.println("Nhập vào loại khách");
                    String typeClient = scanner.nextLine();
                    ClientModel clients = new ClientModel(idClient, nameClient, ageClient, typeClient);
                    cilentService.addCilent(clients);
                    System.out.println("Đã thêm thành công");
                    break;
                case 3:
                    System.out.println("Nhập vào id khách");
                    int id = Integer.parseInt(scanner.nextLine());
                    cilentService.deleteCilentById(id);
                    System.out.println("Đã xóa thành công");
                    break;
                case 4:
                    System.out.println("Nhập vào tên khách muốn tìm");
                    String name = scanner.nextLine();
                    cilentService.seachClient(name);
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
