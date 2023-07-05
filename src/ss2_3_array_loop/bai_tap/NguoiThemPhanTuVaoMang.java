package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class NguoiThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0};
        System.out.println("Nhập vào vị trí muốn thêm");
        int num = (scanner.nextInt() -1) ;
        for (int i = arr.length - 1; i > num; i--) {
            arr[i] = arr[i - 1];
        }
        System.out.println("Nhập phần tử muốn thêm tại vị trí đó");
        arr[num] = scanner.nextInt();
        System.out.println(Arrays.toString(arr));
    }
}
