package ss13_thuat_toan.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class StrAscending {
    public static void strMax(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) < str.charAt(j) || str.charAt(i) > str.charAt(i - 1)) { //kiểm tra mã của char
                    if (result.length() > 0) {
                        if (str.charAt(i) < result.charAt(result.length() - 1)) {
                            continue;
                        }
                    }
                    result += str.charAt(i);
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        strMax(str);
    }
}
