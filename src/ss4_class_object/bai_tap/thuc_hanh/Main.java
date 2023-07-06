package ss4_class_object.bai_tap.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng");
        double rong = scanner.nextDouble();
        System.out.println("Nhâập vào chiều cao");
        double cao = scanner.nextDouble();
        LopHinhChuNhat tong = new LopHinhChuNhat(rong,cao);
        System.out.println("Diện tích = " + tong.tinhDienTich());
        System.out.println("Chu vi = " + tong.tinhChuVi());
        System.out.println(tong.display());
    }
}
