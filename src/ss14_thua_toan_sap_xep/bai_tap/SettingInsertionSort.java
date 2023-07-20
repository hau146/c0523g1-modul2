package ss14_thua_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class SettingInsertionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static String insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        return Arrays.toString(list);
    }

    public static void main(String[] args) {
        System.out.println(insertionSort(list));
    }
}
