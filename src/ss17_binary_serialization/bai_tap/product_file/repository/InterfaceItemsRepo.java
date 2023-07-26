package ss17_binary_serialization.bai_tap.product_file.repository;

import ss17_binary_serialization.bai_tap.product_file.model.Items;

import java.util.List;

public interface InterfaceItemsRepo {
    List<Items> showAll();

    void addItems(Items items);

    void searchIdItems(int id);

    void deleteItems(int id);

    void editItems(int id, Items items);
    int searchIndex(int id);
}
