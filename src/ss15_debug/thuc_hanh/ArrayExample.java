package ss15_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRadom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRadom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = Integer.parseInt(scaner.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới han của mảng");
        }
    }

}
