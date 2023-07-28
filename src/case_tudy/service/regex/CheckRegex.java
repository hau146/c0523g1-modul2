package case_tudy.service.regex;

public class CheckRegex {
    public static final String REGEX_ID_NV = "^[N][V][-][0-9]{4}$";
    public static final String REGEX_ID_KH = "^[K][H][-][0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z|A-Z| ]+$";
    public static final String REGEX_CMND = "^[0-9]{9}$|^[0-9]{12}$";
    public static final String REGEX_NUMBER_PHONE = "^[0|84][0-9]{9}$";
    public static final String REGEX_DATE_BIRTH = "^\\d{1,2}[/|-]\\d{1,2}[/|-]\\d{4}$";

    public CheckRegex() {
    }

    public static boolean checkIdNV(String id) {
        return id.matches(REGEX_ID_NV);
    }

    public static boolean checkIdKH(String id) {
        return id.matches(REGEX_ID_KH);
    }

    public static boolean checkName(String id) {
        return id.matches(REGEX_NAME);
    }

    public static boolean checkCMND(String id) {
        return id.matches(REGEX_CMND);
    }

    public static boolean checkNumPhone(String id) {
        return id.matches(REGEX_NUMBER_PHONE);
    }
    public static boolean checkDateBirth(String id) {
        return id.matches(REGEX_DATE_BIRTH);
    }
}
