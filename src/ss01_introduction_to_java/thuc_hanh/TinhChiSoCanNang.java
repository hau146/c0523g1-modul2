package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng: ");
        int weight = scanner.nextInt();
        System.out.println("Nhập vào chiều cao: ");
        double height = scanner.nextDouble();
        double area = weight / (height * height);
        if (area < 18.5){
            System.out.println("Thiếu cân");
        } else if (area < 25.0){
            System.out.println("Bình thường");
        } else if (area < 30.0){
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}
