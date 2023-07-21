package ss15_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            CalculationExample calculationExample = new CalculationExample();
            calculationExample.caculate(x,y);
        } while (true);
    }

    private void caculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception o){
            System.err.println("Xảy ra ngoại lệ là: " + o.getMessage());
        }
    }
}
