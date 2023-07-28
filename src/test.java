import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        int a = 123442;
        String b = String.valueOf(a);
        String c = String.valueOf(b.charAt(0));
        int d = Integer.parseInt(c);
        System.out.println(d);
    }
}
