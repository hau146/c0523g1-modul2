import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    static boolean solution(int[] a) {
        if (a.length == 0){
            return false;
        }
        int max = a[0];
        int maxIndex = 0;
        boolean flag = false;
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                if (a[maxIndex] == a[i]){
                    break;
                }
                max = a[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] + a[i + 1] == a[maxIndex] && a.length % 2 == 0) {
                for (int j = maxIndex; j < a.length; j++) {
                    if (a[maxIndex] == a[j+1]) {
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3};
        System.out.println(solution(a));
    }
}
