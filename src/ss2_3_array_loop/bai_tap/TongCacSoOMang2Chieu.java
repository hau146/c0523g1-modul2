package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoOMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cột");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số hàng");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần tử ở cột " + i + " hàng " + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều gồm các phần tử: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Nhập vào vị trí cột để tính tổng: ");
        int area = Integer.parseInt(scanner.nextLine()) - 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][area];
        }
        System.out.println("Tổng cột ở vị trí " + (area + 1) + " là: " + sum);
    }
}
