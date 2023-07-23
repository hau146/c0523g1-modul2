package ss16_text_file.bai_tap.file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeFile(String pathFile, String line) { //ghi dữ liệu cho file
        try {
            //bắt đầu đọc
            FileWriter fileWriter = new FileWriter(pathFile, true); //đường dẫn file và nếu ghi true thì chương trình sẽ giữ lại file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //hỗ trợ thêm 1 số phương thức

            bufferedWriter.write(line); //ghi line trong file
            bufferedWriter.newLine(); //xuống dòng

            bufferedWriter.close(); //đóng file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFile(String pathFile) { //đọc all dữ liệu từ file
        List<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = ""; //lưu từng line

            while ((line = bufferedReader.readLine()) != null) { //đọc từng line cho đến cuối
                listLine.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listLine;
    }
}
