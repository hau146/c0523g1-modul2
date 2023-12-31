package ss16_text_file.bai_tap.coppy_file;

import java.io.*;
import java.util.ArrayList;

public class CopyFileText {
    public ArrayList<String> readFileText(String filePath) {
        ArrayList<String> arrayList = new ArrayList();
        try {
            //đọc file từ tham số truyền vào
            File file = new File(filePath);

            //check xem có tồn tại k nếu k thì ném ra lỗi
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            //nếu k lỗi thì đọc file
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
            br.close();

        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return arrayList;
    }

    public void coppyFileText(String filePath, String link) {
        try {
            FileWriter fileWriter = new FileWriter(link, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int i = 0;
            while (i < readFileText(filePath).size()) {
                bufferedWriter.write(readFileText(filePath).get(i));
                i++;
            }
            bufferedWriter.newLine();
            bufferedWriter.write("Có " + countTheCharacter(readFileText(filePath)) + " kí tự");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countTheCharacter(ArrayList<String> arrayList) {
        String str = arrayList.toString();
        String[] newArr = str.split("");
        return (newArr.length - 2); // -2 bởi vì tách ra để đếm từ arraylist sẽ bị dính dấu []

    }

    public static void main(String[] args) {
        String inputFile = "D:\\c0523g1-modul2\\src\\ss16_text_file\\bai_tap\\nguyen_huu_hau.csv";
        String outputFile = "D:\\c0523g1-modul2\\src\\ss16_text_file\\bai_tap\\nguyen_huu_hau_11.csv";
        CopyFileText copyFile = new CopyFileText();
        copyFile.coppyFileText(inputFile, outputFile);
    }
}