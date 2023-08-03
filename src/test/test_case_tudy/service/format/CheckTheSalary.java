package test.test_case_tudy.service.format;

import java.util.Scanner;

public class CheckTheSalary {
    public static int checkTheSalary(String input, String err, int format, boolean flag){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(input);
            format = Integer.parseInt(scanner.nextLine());
            if (format <= 0) {
                System.err.println(err);
            }
        } while (format <= 0);
        return format;
    }
}
