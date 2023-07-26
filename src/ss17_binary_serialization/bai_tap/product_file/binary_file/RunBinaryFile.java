package ss17_binary_serialization.bai_tap.product_file.binary_file;

import ss17_binary_serialization.bai_tap.product_file.model.Items;
import ss17_binary_serialization.bai_tap.product_file.repository.InterfaceItemsRepo;
import ss17_binary_serialization.bai_tap.product_file.repository.ItemsRepository;

import java.util.List;

public class RunBinaryFile {
    public static final String FILE_PATH = "D:\\c0523g1-modul2\\src\\ss17_binary_serialization\\bai_tap\\product_file\\binary_file\\items.txt";
    static ItemsRepository itemsRepository = new ItemsRepository();

    public static void main(String[] args) {
        BinaryFile binaryFile = new BinaryFile();
        binaryFile.writeFileItems(FILE_PATH, itemsRepository.showAll());
        List<Items> itemsList = binaryFile.readFileItems(FILE_PATH);
        for (Items items : itemsList) {
            System.out.println(items);
        }
        System.out.println("Đọc thành công");
    }
}
