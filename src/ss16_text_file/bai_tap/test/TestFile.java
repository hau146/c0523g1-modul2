package ss16_text_file.bai_tap.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
    public static void main(String[] args) {
        String inputFile = "D:\\c0523g1-modul2\\src\\ss16_text_file\\bai_tap\\coppy_file\\cloneFIle.csv";
        String outputFile = "D:\\c0523g1-modul2\\src\\ss16_text_file\\bai_tap\\coppy_file\\cloneFIle1.csv";
        TestFile testFile = new TestFile();
        testFile.coppyFile(inputFile, outputFile);
    }

    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("1");
        }
        return list;
    }

    public void coppyFile(String inputFile, String outputFile){
        try {
            FileWriter fileWriter = new FileWriter(outputFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int i = 0;
            while (i < readFile(inputFile).size()){
                bufferedWriter.write(readFile(inputFile).get(i));
                i++;
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
