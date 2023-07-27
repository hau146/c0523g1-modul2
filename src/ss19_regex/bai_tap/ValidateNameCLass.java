package ss19_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameCLass {
    private static final String REGEX_NAME_CLASS = "^[CAP][0-9]{4}[GHIK]$";
    public static final String[] validNameClass = {"C0223G", "A0323K"};
    public static final String[] invalidNameClass = {"M0318G", "P0323A"};

    public ValidateNameCLass() {
    }

    public boolean checkRegex(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateNameCLass validateNameCLass = new ValidateNameCLass(); //cách đầy đủ
        for (String nameClass : validNameClass) {
            boolean isValid = validateNameCLass.checkRegex(nameClass);
            System.out.println("Name CLass is " + nameClass + " is valid " + isValid);
        }
        for (String nameClass : invalidNameClass) {
            boolean isValid = validateNameCLass.checkRegex(nameClass);
            System.out.println("Name Class is " + nameClass + " is valid " + isValid);
        }


        for (int i = 0; i < validNameClass.length; i++) { //cách đơn giản
            System.out.println(validNameClass[i].matches(REGEX_NAME_CLASS));
        }
        for (int i = 0; i < invalidNameClass.length; i++) {
            System.out.println(invalidNameClass[i].matches(REGEX_NAME_CLASS));
        }
    }
}
