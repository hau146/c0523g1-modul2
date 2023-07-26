package ss17_binary_serialization.bai_tap.product_file.binary_file;

import ss17_binary_serialization.bai_tap.product_file.model.Items;

import java.io.*;
import java.util.List;

public class BinaryFile {

    public List<Items> readFileItems(String filePath) {
        List<Items> items = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            items = (List<Items>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return items;
    }

    public void writeFileItems(String filePath, List<Items> items) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(items);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
