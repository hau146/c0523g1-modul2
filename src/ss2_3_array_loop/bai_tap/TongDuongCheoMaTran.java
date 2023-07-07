package ss2_3_array_loop.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài ma trận :");
        int num = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[num][num];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần tử hàng " + i + " cột " + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        for (int i = arr.length-1 ; i >= 0 ; i--) {
            sum2 += arr[i][i];
        }
        System.out.println();
        System.out.println("Tổng đường chéo chính là : " + sum);
        System.out.println("Tổng đường chéo phụ là : " + sum2);
    }
}
