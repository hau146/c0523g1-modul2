package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số để đọc");
        int number = scanner.nextInt();
        String[] soLe = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] hangChuc = {"teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String tram = "hundred";
        if (number == 0) {
            System.out.println("zero");
        } else if (number < 0) {
            System.out.println("không thể đọc số này");
        } else if (number < 10) {
            number = number;
            System.out.println(soLe[number]);
        } else if (number >= 10 && number <= 20) {
            if (number <= 15) {
                switch (number) {
                    case 10:
                        System.out.println("ten");
                        break;
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                    case 13:
                        System.out.println("thirteen");
                        break;
                    case 15:
                        System.out.println("fifteen");
                        break;
                    case 14:
                        System.out.println("fourteen");
                }
            } else {
                int a = number / 10;
                int b = a * 10 + 1;
                number = number - b;
                System.out.println(soLe[number + 1] + hangChuc[a - 1]);
            }
        } else if (number < 100) {
            int a = number / 10;
            int b = a * 10 + 1;
            number = number - b;
            System.out.println(hangChuc[a - 1] + "-" + soLe[number + 1]);
        } else {
            int a = number / 10;
            int c = number / 100;
            int d = c * 10;
            int area = a - d;
            if (number % 100 == 0) {
                System.out.println(soLe[c] + " " + tram);
            } else if (number % 10 != 0) {
                int b = a * 10 + 1;
                number = number - b;
                System.out.println(soLe[c] + " " + tram + " and " + hangChuc[number] + "-" + soLe[number + 1]);
            } else {
                System.out.println(soLe[c] + " " + tram + " and " + hangChuc[area - 1]);
            }
        }
    }
}

