public class test {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 0; i < h-1; i++) {
            for (int j = 0; j < h * 2; j++) {
                if (j + i == h) {
                    System.out.print(6 - j);
                } else if (j - i == h + 1) {
                    System.out.print(j - 5);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= h * 2; j++) {
                if (j - i == 1) {
                    System.out.print(10 - (j + 4));
                } else if (j + i == 10) {
                    System.out.print(j - 5);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
