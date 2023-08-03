package case_tudy.service.format;

import java.util.Scanner;

public class CheckTypeCustomer {
    public static String checkType(String input, String err, String type, boolean flag) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(input);
            type = scanner.nextLine();
            switch (type) {
                case "Diamond":
                    flag = false;
                    break;
                case "Platinum":
                    flag = false;
                    break;
                case "Gold":
                    flag = false;
                    break;
                case "Silver":
                    flag = false;
                    break;
                case "Member":
                    flag = false;
                    break;
                default:
                    System.err.println(err);
            }
        } while (flag);
        return type;
    }
}
