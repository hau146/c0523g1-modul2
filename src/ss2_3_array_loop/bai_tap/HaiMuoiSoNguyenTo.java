package ss2_3_array_loop.bai_tap;

public class HaiMuoiSoNguyenTo {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 1; j <= number ; j++) {
                if (number % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(number);
            } else {
                i--;
            }
            number++;
            count = 0;
        }
    }
}
