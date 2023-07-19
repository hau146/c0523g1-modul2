package ss13_thuat_toan.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxString {
    public static void checkMaxString(String str) {
        ArrayList newArr = new ArrayList();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) < str.charAt(j) || str.charAt(j-1) > str.charAt(j)) {
                    if (newStr.length() > 0) {
                        if (str.charAt(j-1) < newStr.charAt(newStr.length()-1)) {
                            break;
                        }
                    }
                    newStr += str.charAt(j-1);
                }
            }
            newArr.add(newStr);
            newStr = "";
        }
        int index = 0;
        int maxLenght = ((String)newArr.get(0)).length();
        for (int i = 0; i < newArr.size() ; i++) {
            if (maxLenght < ((String)newArr.get(i)).length()){
                index = i;
                maxLenght = ((String)newArr.get(i)).length();
            }
        }
        System.out.println(newArr.get(index));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        checkMaxString(str);
    }
}
