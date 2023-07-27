package ss17_binary_serialization.bai_tap.product_file.repository;

import ss17_binary_serialization.bai_tap.product_file.model.Items;
import ss17_binary_serialization.bai_tap.product_file.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ItemsRepository implements InterfaceItemsRepo {
    public static final String FILE_ITEMS = "D:\\c0523g1-modul2\\src\\ss17_binary_serialization\\bai_tap\\product_file\\util\\items.cvs";


    @Override
    public List<Items> showAll() {
        List<Items> items = new ArrayList<>();
        List<String> strings = ReadAndWrite.readFileCSV(FILE_ITEMS);
        String[] array = null;
        for (String string : strings) {
            array = string.split(",");
            Items item = new Items(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], array[4]);
            items.add(item);
        }
        return items;
    }

    @Override
    public void addItems(Items items) {
        List<String> stringList = new ArrayList<>();
        stringList.add(items.getInfoToCSV());
        ReadAndWrite.writeFileCSV(FILE_ITEMS, stringList, true);
    }

    @Override
    public void searchIdItems(int id) {
        List<Items> itemsList = this.showAll();
        for (int i = 0; i < itemsList.size(); i++) {
            if (id == itemsList.get(i).getIdItems()) {
                System.out.println(itemsList.get(i));
                break;
            }
        }
    }

    @Override
    public void deleteItems(int index) {
        List<Items> itemsList = this.showAll();
        itemsList.remove(index);
        switchToString(itemsList);
        ReadAndWrite.writeFileCSV(FILE_ITEMS, switchToString(itemsList), false);
    }

    private static List<String> switchToString(List<Items> itemsList) { //hàm này để chuyển các dl item thành string
        List<String> stringList = new ArrayList<>();
        for (Items items : itemsList) {
            stringList.add(items.getInfoToCSV());
        }
        return stringList;
    }

    @Override
    public void editItems(int index, Items items) {
        List<Items> itemsList = this.showAll();
        itemsList.set(index, items);
        switchToString(itemsList);
        ReadAndWrite.writeFileCSV(FILE_ITEMS, switchToString(itemsList), false);
    }

    @Override
    public int searchIndex(int id) {
        List<Items> itemsList = this.showAll();
        for (int i = 0; i < itemsList.size(); i++) {
            if (id == itemsList.get(i).getIdItems()) {
                return i;
            }
        }
        return -1;
    }
}
