package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        float width = scanner.nextFloat();
        System.out.println("Enter height");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.println("area = " + area);
    }
}
