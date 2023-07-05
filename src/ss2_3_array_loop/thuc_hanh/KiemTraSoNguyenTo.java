package ss2_3_array_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static boolean kiemTraNguyenTo(int n){
        if (n < 2){
            return false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào để kiểm tra");
        int number = scanner.nextInt();
        if (kiemTraNguyenTo(number)){
            System.out.println("đó là số nguyên tố");
        } else {
            System.out.println("không phải là số nguyên tố");
        }

    }
}
