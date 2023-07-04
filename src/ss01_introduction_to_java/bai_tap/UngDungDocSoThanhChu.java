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
        if (number >= 0 && number < 10) {
            number = number - 1;
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
                System.out.println(soLe[number] + " " + tram + " and " + hangChuc[c + 1] + "-" + soLe[number + 1]);
            } else {
                System.out.println(soLe[c] + " " + tram +  " and " + hangChuc[area-1]);
            }
        }
//        } else if (number >= 20 && number < 30) {
//            if (number == 20) {
//                System.out.println(hangChuc[1]);
//            } else {
//                number = number - 21;
//                System.out.println(hangChuc[1] + "-" + soLe[number]);
//            }
//        } else if (number >= 30 && number < 40) {
//            if (number == 30) {
//                System.out.println(hangChuc[2]);
//            } else {
//                number = number - 31;
//                System.out.println(hangChuc[2] + "-" + soLe[number]);
//            }
//        } else if (number >= 40 && number < 50) {
//            if (number == 40) {
//                System.out.println(hangChuc[3]);
//            } else {
//                number = number - 41;
//                System.out.println(hangChuc[3] + "-" + soLe[number]);
//            }
//        } else if (number >= 50 && number < 60) {
//            if (number == 50) {
//                System.out.println(hangChuc[4]);
//            } else {
//                number = number - 51;
//                System.out.println(hangChuc[4] + "-" + soLe[number]);
//            }
//        } else if (number >= 60 && number < 70) {
//            if (number == 60) {
//                System.out.println(hangChuc[5]);
//            } else {
//                number = number - 61;
//                System.out.println(hangChuc[5] + "-" + soLe[number]);
//            }
//        } else if (number >= 70 && number < 80) {
//            if (number == 70) {
//                System.out.println(hangChuc[6]);
//            } else {
//                number = number - 71;
//                System.out.println(hangChuc[6] + "-" + soLe[number]);
//            }
//        } else if (number >= 80 && number < 90) {
//            if (number == 80) {
//                System.out.println(hangChuc[7]);
//            } else {
//                number = number - 81;
//                System.out.println(hangChuc[7] + "-" + soLe[number]);
//            }
//        } else if (number >= 90 && number < 100) {
//            if (number == 90) {
//                System.out.println(hangChuc[8]);
//            } else {
//                number = number - 91;
//                System.out.println(hangChuc[8] + "-" + soLe[number]);
//            }

    }
}

