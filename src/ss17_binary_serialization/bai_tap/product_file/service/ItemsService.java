package ss17_binary_serialization.bai_tap.product_file.service;

import ss17_binary_serialization.bai_tap.product_file.model.Items;
import ss17_binary_serialization.bai_tap.product_file.repository.InterfaceItemsRepo;
import ss17_binary_serialization.bai_tap.product_file.repository.ItemsRepository;

import java.util.List;
import java.util.Scanner;

public class ItemsService implements InterfaceItemsService {
    InterfaceItemsRepo itemsRepo = new ItemsRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayItems() {
        List<Items> itemsList = itemsRepo.showAll();
        for (Items items : itemsList) {
            System.out.println(items);
        }
    }

    @Override
    public void addItems() {
        while (true) {
            try {
                System.out.println("Nhập vào id sản phẩm");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào tên sản phẩm");
                String newName = scanner.nextLine();
                System.out.println("Nhập vào giá sản phẩm");
                int newPrice = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào hàng sản xuất");
                String newProduction = scanner.nextLine();
                System.out.println("Nhập vào mô tả sản phẩm");
                String newDescribe = scanner.nextLine();
                Items newItems = new Items(newId, newName, newPrice, newProduction, newDescribe);
                itemsRepo.addItems(newItems);
                System.out.println("\nThêm thành công");
                break;
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập vào số");
            }
        }
    }

    @Override
    public void searchIdIemts() {
        while (true) {
            try {
                System.out.println("Nhập vào id sản phẩm");
                int id = Integer.parseInt(scanner.nextLine());
                itemsRepo.searchIdItems(id);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập vào số !");
            }
        }
    }

    @Override
    public void deleteItems() {
        while (true) {
            try {
                System.out.println("Nhập vào id sản phẩm muốn xóa");
                int deleById = Integer.parseInt(scanner.nextLine());
                int indexItem = itemsRepo.searchIndex(deleById);
                if (indexItem == -1) {
                    System.out.println("Không có id này");
                } else {
                    itemsRepo.deleteItems(indexItem);
                    System.out.println("\nXóa thành công");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập vào số !");
            }
        }
    }

    @Override
    public void editItems() {
        while (true) {
            try {
                List<Items> items = itemsRepo.showAll();
                System.out.println("Nhập vào id sản phẩm muốn sửa !");
                int editItems = Integer.parseInt(scanner.nextLine());
                int indexItems = itemsRepo.searchIndex(editItems);
                if (indexItems == -1) {
                    System.out.println("Không hề có id này");
                } else {
                    System.out.println(items.get(indexItems).getNameItems() + " sửa thành tên : "); //không cho sửa id tránh trùng lặp
                    String editName = scanner.nextLine();
                    System.out.println(items.get(indexItems).getPriceItems() + " sửa thành giá : ");
                    int editPrice = Integer.parseInt(scanner.nextLine());
                    System.out.println(items.get(indexItems).getProductionItems() + " sửa thành loại : ");
                    String editProduction = scanner.nextLine();
                    System.out.println(items.get(indexItems).getProductionItems() + " sửa thành mô tả : ");
                    String editDescribe = scanner.nextLine();
                    Items editItem = new Items(editName, editPrice, editProduction, editDescribe);
                    itemsRepo.editItems(indexItems, editItem);
                    System.out.println("\nSửa thành công");
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập vào số !");
            }
        }
    }
}
