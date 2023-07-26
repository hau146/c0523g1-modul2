import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("Codegym.txt");
            byte[] bytes = new byte[10];
            int i = -1;
            // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
            // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
            while ((i = is.read(bytes)) != -1) {
                String s = new String(bytes, 0, 1);
                System.out.println(s);

            }
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
