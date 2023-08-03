package test.test_case_tudy.service.format;

import case_tudy.service.format.CheckRegex;

import java.time.LocalDate;
import java.util.Scanner;

public class CheckErr {
    static Scanner scanner = new Scanner(System.in);

    public static String checkIdNV(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexIdNv(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static String checkIdKH(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexIdKh(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static String checkIdVilla(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexIdVl(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }
    public static String checkIdHouse(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexIdHo(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }
    public static String checkIdRoom(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexIdRo(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static String checkName(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexName(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static String checkCMND(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexCMND(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static String checkNumPhone(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = CheckRegex.regexNumPhone(tyRegex);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static LocalDate checkDateBirth(String input, String err, LocalDate tyRegex) {
        do {
            System.out.println(input);
            tyRegex = LocalDate.parse(scanner.nextLine());
            if (LocalDate.now().compareTo(tyRegex) < 18) {
                System.err.println(err);
            }
        } while (LocalDate.now().compareTo(tyRegex) < 18);
        return tyRegex;
    }

    public static double checkArea(String input, String err, double tyRegex) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextDouble();
            if (tyRegex < 30*30) {
                System.err.println(err);
            }
        } while (tyRegex < 30*30);
        return tyRegex;
    }

    public static int checkPrice(String input, String err, int tyRegex) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextInt();
            if (tyRegex <= 0) {
                System.err.println(err);
            }
        } while (tyRegex <= 0);
        return tyRegex;
    }

    public static int checkNumberPerson(String input, String err, int tyRegex) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextInt();
            if (tyRegex <= 0 && tyRegex > 20) {
                System.err.println(err);
            }
        } while (tyRegex <= 0 && tyRegex > 20);
        return tyRegex;
    }
}
