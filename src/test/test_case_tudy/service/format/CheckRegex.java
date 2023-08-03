package test.test_case_tudy.service.format;

import java.time.LocalDate;
import java.util.Scanner;

public class CheckRegex {
    public static final String REGEX_ID_NV = "^NV[-][0-9]{4}$";
    public static final String REGEX_ID_KH = "^KH[-][0-9]{4}$";
    public static final String REGEX_ID_VL = "^SVVL[-][0-9]{4}$";
    public static final String REGEX_ID_HO = "^SVHO[-][0-9]{4}$";
    public static final String REGEX_ID_RO = "^SVRO[-][0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z|A-Z| ]+$";
    public static final String REGEX_CMND = "^[0-9]{9}$|^[0-9]{12}$";
    public static final String REGEX_NUMBER_PHONE = "^[0|84][0-9]{9}$";

//    public static final String REGEX_DATE_BIRTH = "^\\d{1,2}[/|-]\\d{1,2}[/|-]\\d{4}$";

    public CheckRegex() {
    }

    //được tạo ra để phục vụ cho định dạng đầu vào
    public static boolean regexIdNv(String id) {
       return id.matches(REGEX_ID_NV);
    }
    public static boolean regexIdKh(String id) {
        return id.matches(REGEX_ID_KH);
    }
    public static boolean regexIdVl(String id) {
        return id.matches(REGEX_ID_VL);
    }
    public static boolean regexIdHo(String id) {
        return id.matches(REGEX_ID_HO);
    }

    public static boolean regexIdRo(String id) {
        return id.matches(REGEX_ID_RO);
    }

    public static boolean regexName(String name) {
        return name.matches(REGEX_NAME);
    }

    public static boolean regexCMND(String CMND) {
        return CMND.matches(REGEX_CMND);
    }

    public static boolean regexNumPhone(String numPhone) {
        return numPhone.matches(REGEX_NUMBER_PHONE);
    }
}
