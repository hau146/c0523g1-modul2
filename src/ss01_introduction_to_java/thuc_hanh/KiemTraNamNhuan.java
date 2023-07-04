package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibale1 = year % 4 == 0;
        boolean isDivisibale2 = year % 100 == 0;
        boolean isDivisibale3 = year % 400 == 0;
        if (isDivisibale1) {
            if (isDivisibale2) {
                if (isDivisibale3) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            System.out.println("Không có năm này ");
        }
        if (isLeapYear) {
            System.out.println("Đây là năm nhuận");
        } else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }
}
