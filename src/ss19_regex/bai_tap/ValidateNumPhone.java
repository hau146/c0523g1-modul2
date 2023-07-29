package ss19_regex.bai_tap;

public class ValidateNumPhone {
    private static final String REGEX_NUMPHONE = "^([0-9]{2})?-([0][0-9]{9})$";
    public static final String[] valiNumPhone = {"(84)-(0978489648)"};
    public static final String[] invaliNumPhone = {"(a8)-(22222222)", "(84)-(22b22222)"," (84)-(9978489648)"};

    public ValidateNumPhone() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < valiNumPhone.length ; i++) {
            System.out.println(valiNumPhone[i] + "\t" + valiNumPhone[i].matches(REGEX_NUMPHONE));
        }
        for (int i = 0; i < invaliNumPhone.length ; i++) {
            System.out.println(invaliNumPhone[i] + "\t" + invaliNumPhone[i].matches(REGEX_NUMPHONE));
        }
    }
}
