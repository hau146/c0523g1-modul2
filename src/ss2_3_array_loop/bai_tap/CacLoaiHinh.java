package ss2_3_array_loop.bai_tap;

import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area = -1;
        while (area != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            area = scanner.nextInt();
            switch (area) {
                case 1:
                    System.out.println("Enter the length of the rectangle");
                    int a = scanner.nextInt();
                    System.out.println("Enter the rectangle width");
                    int b = scanner.nextInt();
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the height of the triangle");
                    int h = scanner.nextInt();
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter the height of the triangle");
                    int d = scanner.nextInt();
                    for (int i = 0; i < d; i++) {
                        for (int j = 0; j < d; j++) {
                            if (d - j > i) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
