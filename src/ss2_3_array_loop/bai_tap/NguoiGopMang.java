package ss2_3_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class NguoiGopMang {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập độ dài mảng thứ nhất");
//        int a = scanner.nextInt();
//        int[] arr1 = new int[a];
//        write(arr1);
//        System.out.println("Nhập độ dài mảng thứ hai");
//        int b = scanner.nextInt();
//        int[] arr2 = new int[b];
//        write(arr2);
//        int[] arr3 = new int[arr1.length + arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr3[i] = arr1[i];
//        }
//        for (int i = arr1.length; i < arr3.length; i++) {
//            arr3[i] = arr2[i - arr1.length];
//        }
//        System.out.println(Arrays.toString(arr3));
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            int j = 0;
            while (j < arr2.length){
                arr3[j + arr1.length] = arr2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

//    public static void write(int[] array) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Nhập vào vị trí thứ" + (i + 1));
//            int a = scanner.nextInt();
//            array[i] = a;
//        }
//    }
}
