package ss2_3_array_loop.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền đầu tư: ");
        double money = scanner.nextDouble();
        System.out.println("Nhập số tháng: ");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất hàng năm về tỷ lệ phần trăm: ");
        double interestRate = scanner.nextDouble();
        double area = 0;
        for (int i = 0; i < month ; i++) {
            area += money * (interestRate/100) / 12 * month;
        }
        System.out.println("lãi suất là: " + area);
    }
}
