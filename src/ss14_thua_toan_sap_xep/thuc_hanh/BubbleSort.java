package ss14_thua_toan_sap_xep.thuc_hanh;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list){
        boolean flag = true;
        for (int i = 1; i < list.length && flag ; i++) {
            flag = false;
            for (int j = 0; j < list.length - i ; j++) {
                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i]+ "\t");
        }
    }
}
