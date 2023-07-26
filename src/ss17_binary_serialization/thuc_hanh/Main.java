package ss17_binary_serialization.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = is.read(buffer)) > 0){
                os.write(buffer, 0, lenght);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhận tệp nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhận tệp đích: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile,destFile);
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.println("Hoàn thành sao chép");
        } catch (IOException e) {
            System.out.printf("Không thể sao chép tệ đó");
            System.out.printf(e.getMessage());
        }
    }
}
