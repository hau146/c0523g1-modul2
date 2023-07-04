package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số để đọc");
        int number = scanner.nextInt();
        String[] soLe = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] soDuoi20 = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String soTren20 = "twenty";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 1:
                    System.out.println(soLe[0]);
                    break;
                case 2:
                    System.out.println(soLe[1]);
                    break;
                case 3:
                    System.out.println(soLe[2]);
                    break;
                case 4:
                    System.out.println(soLe[3]);
                    break;
                case 5:
                    System.out.println(soLe[4]);
                    break;
                case 6:
                    System.out.println(soLe[5]);
                    break;
                case 7:
                    System.out.println(soLe[6]);
                    break;
                case 8:
                    System.out.println(soLe[7]);
                    break;
                case 9:
                    System.out.println(soLe[8]);
                    break;
            }
//        } else if (number < 20) {
//            switch (number) {
//                case 10:
//                    System.out.println(muoi);
//                case 11:
//                    System.out.println("eleven");
//                case 12:
//                    System.out.println("twelve");
//                case 13:
//                    System.out.println("thirteen");
//                case 14:
//                    System.out.println("four" + muoi);
//                case 15:
//                    System.out.println("fift" + muoi);
//                case 16:
//                    System.out.println("six" + muoi);
//                case 17:
//                    System.out.println("seven" + muoi);
//                case 18:
//                    System.out.println("eight" + muoi);
//                case 19:
//                    System.out.println("eight" + muoi);
//            }
        }
    }
}

