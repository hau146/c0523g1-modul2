package ss15_debug.bai_tap.try_catch;

import ss15_debug.bai_tap.try_catch.IllegalTriangleException;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập vào cạnh a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh b");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh c");
                int c = Integer.parseInt(scanner.nextLine());
                checkErr(a, b, c);
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập vào số\n");
                break;
            }
            System.out.println("Là 3 cạnh của tam giác\n");
        }
    }

    public static void checkErr(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0\n");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại\n");
        }
    }
}
