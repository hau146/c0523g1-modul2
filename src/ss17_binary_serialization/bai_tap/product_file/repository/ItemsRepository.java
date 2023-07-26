package ss17_binary_serialization.bai_tap.product_file.repository;

import ss17_binary_serialization.bai_tap.product_file.model.Items;

import java.util.ArrayList;
import java.util.List;

public class ItemsRepository implements InterfaceItemsRepo {
    private static List<Items> itemsList = new ArrayList<>();

    static {
        itemsList.add(new Items(1, "Khẩu trang", 30000, "Khẩu trang y tế", "Được sản xuất để chống bụi"));
        itemsList.add(new Items(2, "Nước lọc", 15000, "Nước đóng chai", "Được sản xuất để giải khát"));
        itemsList.add(new Items(3, "Mì tôm", 27000, "Mì ăn liền", "Được sản xuất để cứu đói"));
    }

    @Override
    public List<Items> showAll() {
        return itemsList;
    }

    @Override
    public void addItems(Items items) {
        itemsList.add(items);
    }

    @Override
    public void searchIdItems(int id) {
        for (int i = 0; i < itemsList.size(); i++) {
            if (id == itemsList.get(i).getIdItems()) {
                System.out.println(itemsList.get(i));
                break;
            }
        }
    }

    @Override
    public void deleteItems(int index) {
        itemsList.remove(index);
    }

    @Override
    public void editItems(int index, Items items) {
        itemsList.set(index, items);
    }

    @Override
    public int searchIndex(int id) {
        for (int i = 0; i < itemsList.size(); i++) {
            if (id == itemsList.get(i).getIdItems()) {
                return i;
            }
        }
        return -1;
    }
}
