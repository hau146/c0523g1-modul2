package ss13_thuat_toan.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SearchBinary {
    public static int binarySearch(ArrayList array, int left, int right, int value) {
        while (left > right) {
            int middle = (left + right) / 2;
            int arr = ((int) array.get(middle));
            if (arr == value) {
                return middle;
            } else if (value > arr) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int lenght = Integer.parseInt(scanner.nextLine());
        ArrayList newArr = new ArrayList();
        for (int i = 0; i < lenght; i++) {
            System.out.println("Nhập vào giá trị " + (i + 1));
            newArr.add(Integer.parseInt(scanner.nextLine()));
        }
        Collections.sort(newArr);
        System.out.println(newArr);
        System.out.println("Giờ bạn muốn tìm số nào ?");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(newArr, 0, newArr.size() - 1, searchNumber));
    }
}
