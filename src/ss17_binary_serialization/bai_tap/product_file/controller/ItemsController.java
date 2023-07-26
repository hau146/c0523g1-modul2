package ss17_binary_serialization.bai_tap.product_file.controller;

import ss17_binary_serialization.bai_tap.product_file.service.InterfaceItemsService;
import ss17_binary_serialization.bai_tap.product_file.service.ItemsService;

import java.util.Scanner;

public class ItemsController {
    static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        InterfaceItemsService itemsService = new ItemsService();
        int selection = 0;
        do {
            try {
                System.out.println("\n---Danh sách quản lý sản phẩm---");
                System.out.println("1. Xem danh sách ");
                System.out.println("2. Thêm sản phẩm ");
                System.out.println("3. Tìm sản phẩm ");
                System.out.println("4. Xóa sản phẩm ");
                System.out.println("5. Sửa sản phẩm ");
                System.out.println("0. Exit Menu ");
                selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1:
                        itemsService.displayItems();
                        break;
                    case 2:
                        itemsService.addItems();
                        break;
                    case 3:
                        itemsService.searchIdIemts();
                        break;
                    case 4:
                        itemsService.deleteItems();
                        break;
                    case 5:
                        itemsService.editItems();
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số !");
            } catch (Exception e){
                System.err.println("Có lỗi xảy ra vui lòng run lại !");
            }
        } while (true);
    }

}
