//package ss15_debug.bai_tap;
//
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        boolean flag = false;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập vào cạnh a");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.println("Nhập vào cạnh b");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.println("Nhập vào cạnh c");
//            int c = Integer.parseInt(scanner.nextLine());
//            try {
//                illegalTriangleException(a, b, c);
//
//            } catch (IllegalTriangleException e) {
//                System.err.println(e.getMessage());
//                flag = true;
//            }
//        } while (flag);
//    }
//
//    private static void illegalTriangleException(int a, int b, int c) throws IllegalTriangleException {
//
//        if (a <= 0 || b <= 0 || c <= 0) {
//            throw new IllegalTriangleException("canh nho hon 0");
//        }
//    }
//}
