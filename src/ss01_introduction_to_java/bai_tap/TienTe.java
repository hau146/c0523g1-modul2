package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Mời bạn nhập vào số tiền USD: ");
        int usd = scanner.nextInt();
        double area = usd * vnd;
        System.out.println("Số tiền USD quy đổi ra là: " + area + " VND");
    }
}
