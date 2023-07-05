package ss2_3_array_loop.bai_tap;

public class CacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (true){
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                if (num > 100){
                    break;
                }
                System.out.println(num);
            }
            num++;
            count = 0;
        }
    }
}
