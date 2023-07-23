package ss16_text_file.bai_tap;

import java.io.*;

public class CopyFileText {
    public void readFileText(String filePath){
        try {
            //đọc file từ tham số truyền vào
            File file = new File(filePath);

            //check xem có tồn tại k nếu k thì ném ra lỗi
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            //nếu k lỗi thì đọc file
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

        } catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
    }
    public void coppyFileText(String filePath, String fileCoppy){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(fileCoppy);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}