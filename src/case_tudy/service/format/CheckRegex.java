package case_tudy.service.format;

import java.time.LocalDate;
import java.util.Scanner;

public class CheckRegex {
    public static final String REGEX_ID_NV = "^[N][V][-][0-9]{4}$";
    public static final String REGEX_ID_KH = "^[K][H][-][0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z|A-Z| ]+$";
    public static final String REGEX_CMND = "^[0-9]{9}$|^[0-9]{12}$";
    public static final String REGEX_NUMBER_PHONE = "^[0|84][0-9]{9}$";
    public static final String REGEX_DATE_BIRTH = "^\\d{1,2}[/|-]\\d{1,2}[/|-]\\d{4}$";
    static Scanner scanner = new Scanner(System.in);

    public CheckRegex() {
    }

    //được tạo ra để phục vụ cho định dạng đầu vào
    public static String checkIdNV(String input, String err, String tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = scanner.nextLine();
            flag = tyRegex.matches(REGEX_ID_NV);
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
            flag = tyRegex.matches(REGEX_ID_KH);
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
            flag = tyRegex.matches(REGEX_NAME);
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
            flag = tyRegex.matches(REGEX_CMND);
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
            flag = tyRegex.matches(REGEX_NUMBER_PHONE);
            if (!flag) {
                System.err.println(err);
            }
        } while (!flag);
        return tyRegex;
    }

    public static LocalDate checkDateBirth(String input, String err, LocalDate tyRegex, boolean flag) {
        do {
            System.out.println(input);
            tyRegex = LocalDate.parse(scanner.nextLine());
            if (LocalDate.now().compareTo(tyRegex) < 18) {
                System.err.println(err);
            }
        } while (LocalDate.now().compareTo(tyRegex) < 18);
        return tyRegex;
    }
}
