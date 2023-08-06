package case_tudy.service.format;

import java.time.LocalDate;

public class Treatment {
    public static String treatment(LocalDate localDate, String id) {
        String str = String.valueOf(localDate);
        String[] arr = str.split("-");
        String str2 = "";
        String result = "";
        for (String s : arr) {
            str2 += s;
        }
        result = str2 + id;
        return result;
    }

    public static int treatment(LocalDate localDate) {
        String str = String.valueOf(localDate);
        String[] arr = str.split("-");
        String str2 = "";
        int result = 0;
        for (String s : arr) {
            str2 += s;
        }
        result = Integer.parseInt(str2);
        return result;
    }
}
