package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int arr = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[arr];
        for (int i = 0; i < arr; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            int a = Integer.parseInt(scanner.nextLine());
            arr2[i] = a;
        }
        System.out.println(Arrays.toString(arr2));
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (min > arr2[i]) {
                min = arr2[i];
            }
        }
        System.out.println("Số bé nhất là: " + min);
    }
}
