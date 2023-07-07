package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCuaMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hàng");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào cột");
        int num2 = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[num1][num2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử ở hàng: " + i + " cột: " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều có các phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}
