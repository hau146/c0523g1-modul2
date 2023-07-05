package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "nguyen huu hau";
        String[] array = str.split("");
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập vào kí tự để đếm số lần xuất hiện: ");
        String checkStr = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (checkStr.equals(array[i])) {
                count++;
            }
        }
        System.out.println("Kí tự " + checkStr + " xuất hiện " + count + " lần");
    }
}
