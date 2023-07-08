import java.lang.reflect.Array;
import java.util.Arrays;

public class test {

    public static int[] oddNumbers() {
        int[] arr = new int[5];
        int j = 1;
        for (int i = 0; i < 10  ; i++) {
            for (; j <= 10  ;) {
                arr[i] = j;
                j+=2;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(oddNumbers()));
    }
}
