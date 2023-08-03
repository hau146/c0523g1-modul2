package case_tudy.service.format;

import java.util.Scanner;

public class Confirm {
    public static boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.err.println("Are you sure you want to delete ?");
        System.out.println("YES OR NO");
        String selection = scanner.nextLine();
        if (selection.equals("YES")) {
            flag = true;
        } else if (selection.equals("NO")) {
            flag = false;
        }
        return flag;
    }
}
