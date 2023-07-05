package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class NguoiXoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        System.out.println("Nhập vào số muốn xóa: ");
        int a = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == a) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
